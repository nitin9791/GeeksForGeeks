package dynamic_programming;

public class LongestPalindromicSubsequence {

	public static void LongestPalindrome(){
		String s="NITINTIWARI";
		int n=s.length(),lps[][] = new int[n][n];
		for( int i=0;i<n;i++){
			lps[i][i] = 1;
		}
		for(int l=2;l<=n;l++){
			for(int i=0;i<n-l+1;i++){
				int j=i+l-1;
				if(s.charAt(i) == s.charAt(j)){
					lps[i][j] = 2+lps[i+1][j-1];
				}
				else{
					lps[i][j] = Math.max(lps[i][j-1],lps[i+1][j]);
				}
			}
		}
		System.out.println(lps[0][n-1]);
	}
}
