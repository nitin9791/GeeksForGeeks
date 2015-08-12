package arrays;

public class BinarySearchInPivotedArray {
	
	public static int binarySearch(int a[],int low,int high,int search){
		while(low<=high){
			int mid = (low+high)/2;
			if(a[mid] == search){
				return mid+1;
			}
			else if(a[mid]<search){
				low = mid+1;
			}
			else{
				high = mid -1;
			}
		}
		return -1;
	}
	public static int pivotedSearch(int a[],int n){
		int loc=0;
		for(int i=1;i<a.length;i++){
			if(a[i]< a[i-1]){
				loc = i-1;
				break;
			}
			
		}
		System.out.println(loc);
		if(n<a[0]){
			return binarySearch(a,loc+1,a.length-1,n);
		}
		else{
			return binarySearch(a,0,loc,n);
		}
	}
}
