package arrays;

public class FindOddElement {
	public static void FindOddElementFromArray(int a[]){
		int xor=0;
		for(int i=0;i<a.length;i++){
			xor = xor^a[i];
		}
		System.out.println(xor);
	}
}
