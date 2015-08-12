package dynamic_programming;

public class LongestBitonicSubsequence {

	public static void findLongestBitonicSubsequence(){
		int a[] = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
		int lis[] = findLIS(a);
		int lds[] = findLDS(a);
		int max=0;
		for(int i=0;i<a.length;i++){
			max=Math.max(max,lis[i]+lds[i]);
		}
		System.out.println(max);
	}
	
	public static int[] findLIS(int a[]){
		int n=a.length;
		int lis[] = new int[n];
		lis[0]=1;
		for(int i=1;i<n;i++){
			lis[i]=0;
			for(int j=0;j<i;j++){
				if(a[i]>=a[j]){
					lis[i] = Math.max(lis[i],lis[j]+1);
				}
			}
		}
		return lis;
	}
	public static int[] findLDS(int a[]){
		int n=a.length;
		int lds[] = new int[n];
		lds[0]=1;
		for(int i=1;i<n;i++){
			lds[i]=0;
			for(int j=0;j<i;j++){
				if(a[i]<=a[j]){
					lds[i] = Math.max(lds[i],lds[j]+1);
				}
			}
		}
		return lds;
	}
}
