class Solution {
    public int longestPalindromeSubseq(String s) {
        int[][] dp = new int[s.length()+1][s.length()+1];
        StringBuilder sb = new StringBuilder(s);
        
        String s2 = sb.reverse().toString();
        int n = s.length();
        for(int i = 0;i<n+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==0 || j==0) dp[i][j] = 0;
            }
        }
        for(int i = 1;i<n+1;i++){
            for(int j=1;j<n+1;j++){
                if(s.charAt(i-1) == s2.charAt(j-1)) dp[i][j] = 1+dp[i-1][j-1];

                else dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
            }
        }

        return dp[n][n];

    //     for(int[] row : dp){
    //         Arrays.fill(row , -1);
    //     }
    //    return fun(s,0,s.length()-1,dp); 
    }
    static int fun(String s , int i , int j,int[][] dp){
        //base case
        if(i > j) return 0;

        if(dp[i][j] != -1) return dp[i][j];


        if(s.charAt(i) == s.charAt(j)){
            if(i==j) return dp[i][j] = 1+fun(s,i+1,j-1,dp);
            
            else return dp[i][j] = 2+fun(s,i+1,j-1,dp);            
        }

        else {
            int pick = fun(s,i+1,j,dp);

            int Notpick = fun(s,i,j-1,dp);

            return dp[i][j] = Math.max(pick,Notpick);
        }
    }
}