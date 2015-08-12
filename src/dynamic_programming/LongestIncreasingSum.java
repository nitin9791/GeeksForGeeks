package dynamic_programming;

public class LongestIncreasingSum {

	public static void findLongestIncreasingSum(){
		
		int a[] = {1, 101, 2, 3, 100, 4, 5};
		int n=a.length,max=0;
		int lis[] = new int[n];
		lis[0]=a[0];
		for(int i=1;i<n;i++){
			lis[i]=0;
			for(int j=0;j<i;j++){
				if(a[i] >= a[j]){
					lis[i] = Math.max(lis[i], lis[j]+a[i]); 
				}
			}
			if(lis[i]>max){
				max=lis[i];
			}
		}
		System.out.println(max);
	}
}
