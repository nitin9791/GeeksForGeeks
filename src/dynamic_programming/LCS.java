package dynamic_programming;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LCS {
	
	public static void findLCS(){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String s1 = br.readLine();
			String s2 = br.readLine();
			int lcs[][] = new int[s1.length()+1][s2.length()+1];
			for(int i=0;i<=s1.length();i++){
				lcs[i][0] = 0;
			}
			for(int i=0;i<=s2.length();i++){
				lcs[0][i] = 0;
			}
			for(int i=0;i<s1.length();i++){
				for(int j=0;j<s2.length();j++){
					if(s1.charAt(i) == s2.charAt(j)){
						lcs[i+1][j+1] = lcs[i][j] + 1;
					}
					else{
						lcs[i+1][j+1] = Math.max(lcs[i][j+1],lcs[i+1][j]);
					}
				}
			}
			System.out.println(lcs[s1.length()][s2.length()]);
			printLCS(s1,s2,lcs,s1.length(),s2.length());
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void printLCS(String s1,String s2,int lcs[][],int m,int n){
		if(m==0 || n == 0){
			return;
		}
		if(s1.charAt(m-1) == s2.charAt(n-1)){
			printLCS(s1,s2,lcs,m-1,n-1);
			System.out.print(s1.charAt(m-1));
		}
		else if(lcs[m][n] == lcs[m-1][n]){
			printLCS(s1,s2,lcs,m-1,n);
		}
		else{
			printLCS(s1,s2,lcs,m,n-1);
		}
	}

}
