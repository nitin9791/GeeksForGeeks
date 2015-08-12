package dynamic_programming;

public class LIS {
	public static void findLIS(){
		int a[] = {1,5,2,43,6,2,3,5,2,1,5,7,89,3,4,56,2,4,6,33,4};
		int lis[] = new int[a.length];
		int max=lis[0]=1;
		for(int i=1;i<a.length;i++){
			lis[i]=1;
			for(int j=0;j<i;j++){
				if(a[i]>a[j] && lis[i] < (lis[j]+1)){
					lis[i] = lis[j] + 1;
				}
				if(max < lis[i]){
					max = lis[i];
				}
			}
		}
		System.out.println(max);
	}
}
