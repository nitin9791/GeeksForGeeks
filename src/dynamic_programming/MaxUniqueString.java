package dynamic_programming;

public class MaxUniqueString {
	public static void maxUniqueSubString(){
		int visited[] = new int[256];
		String s = "ABDEFGABEF";
		int prev,max=1,cur_max=1,startIndex=0;
		for(int i=0;i<256;i++){
			visited[i] = -1;
		}
		visited[(int)(s.charAt(0))] = 0;
		for(int i=1;i<s.length();i++){
			prev = visited[(int)(s.charAt(i))];
			if(prev == -1 || i-cur_max > prev  ){
				cur_max++;
			}
			else{
				cur_max = i-prev; 
			}
			visited[(int)(s.charAt(i))] = i;
			if(max < cur_max){
				max=cur_max;
				startIndex = i-cur_max+1;
			}
		}
		System.out.println(startIndex+" "+max);
		System.out.println(s.substring(startIndex, startIndex+max));
		
	}
}
