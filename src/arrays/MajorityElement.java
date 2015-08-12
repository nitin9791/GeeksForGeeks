package arrays;

public class MajorityElement {
	public static void FindMajrityElement(int a[]){
			int count = 1,element = a[0];
			for(int i=1;i<a.length;i++){
				if(count == 0){
					count = 1;
					element = a[i];
				}
				else if(element == a[i]){
					count++;
				}
				else{
					count--;
				}
			}
			count =0;
			for(int i=0;i<a.length;i++){
				if(a[i] == element)
					count++;
			}
			if(count >= a.length/2){
				System.out.println("Element is "+element);
			}
			else{
				System.out.println("Not Found");
			}
	}
}