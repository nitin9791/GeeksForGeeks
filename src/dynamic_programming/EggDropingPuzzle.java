package dynamic_programming;

public class EggDropingPuzzle {
	public static void eggDrop(){
		int floor=36,eggs=2;
		int edc[][]= new int[eggs+1][floor+1];
		for(int i=0;i<=eggs;i++){
			edc[i][0]=0;
			edc[i][1]=1;
		}
		for(int i=0;i<=floor;i++){
			edc[1][i]=i;
		}
		for(int i=2;i<=eggs;i++){
			for(int j=2;j<=floor;j++){
				edc[i][j] = Integer.MAX_VALUE;
				for(int k=1;k<=j;k++){
					
					int tmp = 1+Math.max(edc[i-1][k-1], edc[i][j-k]);
					edc[i][j] = Math.min(tmp,edc[i][j]);
				}
			}
		}
		System.out.println(edc[eggs][floor]);
	}
}
