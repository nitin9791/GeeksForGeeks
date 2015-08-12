package dynamic_programming;

public class MatrixChainMultiplication {
	public static void chainMultiplication(){
		int a[] = {10, 20, 30},n=a.length;
		int mat[][] = new int[n][n];
		for(int i=1;i<n;i++){
			mat[i][i]=0;
		}
		for(int l=2;l<n;l++){
		for(int i=1;i<n-l+1;i++){
			int j=i+l-1;
			//System.out.println(i+" "+j);
				mat[i][j] = Integer.MAX_VALUE;
				for(int k=i;k<j;k++){
					mat[i][j] = Math.min(mat[i][j],mat[i][k]+mat[k+1][j]+a[i-1]*a[k]*a[j]);
				}
			}
		}
		System.out.println(mat[1][n-1]);
	}
}
