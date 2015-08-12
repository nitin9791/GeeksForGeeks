package arrays;

public class LargestSumContiguousSubArray {
	public static void findLargestSumContiguiousSubArray(int a[]){
		int sum=a[0],max=a[0];
		for(int i=1;i<a.length;i++){
			sum = Math.max(a[i] , sum+a[i]);
			if(sum > max)
				max = sum;
		}
		System.out.println(max);
	}
}
