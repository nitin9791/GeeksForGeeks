package dynamic_programming;

public class CoinChange {
	public static void countNumbers(){
		int sm[] = {2,5,3,6};
		int n=10,m=sm.length;
		int count[][] = new int[m][n+1];
		for(int i=0;i<m;i++){
			for(int j=0;j<=n;j++){
				if(j==0){
					count[i][j] = 1;
					continue;
				}
				int x = (j-sm[i] >=0) ? count[i][j-sm[i]]:0;
				int y = (i>0) ? count[i-1][j] : 0;
				count[i][j] = x+y;
			}
		}
		System.out.println(count[m-1][n]);
	}
}
