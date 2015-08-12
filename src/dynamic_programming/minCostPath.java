package dynamic_programming;

public class minCostPath {
	public static void findMinCostPath(){
		int cost[][] = {{1, 2, 3},
                		{4, 8, 2},
                		{1, 5, 3} };
		int tc[][] = new int[3][3];
		tc[0][0]=cost[0][0];
		int m=2,n=2;
		for(int i=1;i<=m;i++){
			tc[i][0] = tc[i-1][0] + cost[i][0];
		}
		for(int i=1;i<=n;i++){
			tc[0][i] = tc[0][i-1] + cost[0][i];
		}
		
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++){
				tc[i][j] = min(tc[i-1][j-1],tc[i-1][j],tc[i][j-1]) + cost[i][j];
			}
		}
		System.out.println("Cost is "+tc[m][n]);
	}
	public static int min(int a,int b,int c){
		return (a<b) ? ( a<c ? a:c ) : (b<c ? b : c);
	}
}
