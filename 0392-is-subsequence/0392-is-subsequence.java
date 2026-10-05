class Solution {
    public boolean isSubsequence(String s, String t) {
     int[][] dp = new int[s.length()+1][t.length()+1];

     for(int i = 0;i<s.length()+1;i++){
        for(int j =0;j<t.length()+1;j++){
            if(i==0 || j==0 ) dp[i][j] = 0;
        }
     }   
     for(int i = 1;i<s.length()+1;i++){
        for(int j =1;j<t.length()+1;j++){
            if(s.charAt(i-1) == t.charAt(j-1) ) dp[i][j] = 1+dp[i-1][j-1];

            else dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
        }
     }
     int LCS = dp[s.length()][t.length()];

     return s.length()==LCS;   
    }
}