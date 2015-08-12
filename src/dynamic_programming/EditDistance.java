package dynamic_programming;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EditDistance {
	public static void findEditDistance(){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String s1 = br.readLine();
			String s2 = br.readLine();
			int Del_Cost = Integer.parseInt(br.readLine());
			int rep_Cost = Integer.parseInt(br.readLine());
			int ins_Cost = Integer.parseInt(br.readLine());
			int ed[][] = new int[s1.length()+1][s2.length()+1];
			for(int i=0;i<=s1.length();i++){
				ed[i][0] = i;
			}
			for(int i=0;i<=s2.length();i++){
				ed[0][i] = i;
			}
			for(int i=0;i<s1.length();i++){
				for(int j=0;j<s2.length();j++){
					ed[i+1][j+1] = Math.min(ed[i][j+1]+Del_Cost,ed[i+1][j]+ins_Cost);
					ed[i+1][j+1] = Math.min(ed[i+1][j+1],ed[i][j] + ((s1.charAt(i) == s2.charAt(j))?0:rep_Cost));
				}
			}
			System.out.println(ed[s1.length()][s2.length()]);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
