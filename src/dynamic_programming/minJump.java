package dynamic_programming;
public class minJump {
	public static void jumpNeeded(){
		int a[] = {1, 3, 6, 1, 0, 9};
		int jumps[] = new int[a.length];
		jumps[0]=0;
		for(int i=1;i<a.length;i++){
			jumps[i]=Integer.MAX_VALUE;
			for(int j=0;j<i;j++){
				if(a[j]+j >= i){
					jumps[i] = Math.min(jumps[i],(jumps[j]+1));
				}
			}
			//System.out.println(jumps[i]);
		}
		System.out.println(jumps[a.length-1]);
	}
}
