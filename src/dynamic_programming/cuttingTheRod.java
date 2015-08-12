package dynamic_programming;

public class cuttingTheRod {
	public static void rodCut(){
		int price[] = {1, 5, 8, 9, 10, 17, 17, 20};
		int l=price.length;
		int cost[] = new int[l+1];
		cost[0]=0;
		for(int i=1;i<=l;i++){
			cost[i] = price[i-1];
			for(int j=0;j<i;j++){
				cost[i] = Math.max(cost[i],cost[j]+cost[i-j]);
			}
		}
		System.out.println(cost[l]);
	}
}
