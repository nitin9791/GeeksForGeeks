package dynamic_programming;

public class Knapsack {
	public static void knapsackProblem(){
		int cost[] = {60, 100, 120};
		int wt[] = {10,20,30};
		int W=20;
		int ks[][] =new int[wt.length+1][W+1];
		for(int i=0;i<=wt.length;i++){
			for(int j=0;j<=W;j++){
				if(i==0 || j==0){
					ks[i][j] = 0;
				}
				else{
					if(wt[i-1] <= j)
					ks[i][j] = Math.max(ks[i-1][j-wt[i-1]]+cost[i-1],ks[i-1][j]);
					else{
						ks[i][j] = ks[i-1][j];
					}
				}
				
			}
		}
		System.out.println(ks[wt.length][W]);
	}
}
