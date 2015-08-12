package arrays;

public class FindMissingNumber {
	public static void FindMissingNumber(int a[]){
		int txor=0,nxor=0;
		int n=a.length+1;
		for(int i=1;i<=n;i++){
			txor ^= i;
		}
		for(int i=0;i<a.length;i++){
			nxor ^= a[i];
		}	
		System.out.println(txor^nxor);
	}

}
