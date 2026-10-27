class Solution {
    public boolean isMatch(String s, String p) {
        // return fun(s,p,s.length(),p.length());
        // return memo(s,p);
        return tab(s,p);
    }
    // static boolean fun(String s , String p,int i , int j , Boolean[][] dp){
    //     if(j == 0 && i == 0) return true;
    //     if( j == 0 && i >0) return false;

    //     if(i == 0){
    //         for(int k = j-1 ; k >= 0;k--){
    //             if(p.charAt(k) != '*') return false;
    //         }
    //         return true;
    //     }

    //     if(dp[i-1][j-1] != null) return dp[i-1][j-1];
    //     if(p.charAt(j-1)=='?' || s.charAt(i-1) == p.charAt(j-1)) return dp[i-1][j-1] = fun(s,p,i-1,j-1 ,dp);
    //     else if(p.charAt(j-1) == '*'){
    //         return dp[i-1][j-1] = fun(s,p,i,j-1 ,dp ) ||fun(s,p,i-1,j , dp);
    //         }
    //     else return dp[i-1][j-1] = false;
    // }
    // static boolean memo(String s , String p){
    //     Boolean[][] dp = new Boolean[s.length()+1][p.length()+1];
    //     for(Boolean[] row : dp){
    //         Arrays.fill(row,null);
    //     }
    //     return fun(s,p , s.length() , p.length() , dp);
    // }


    static boolean tab(String s , String p){

        boolean[][] dp = new boolean[s.length()+1][p.length()+1];
        dp[0][0] = true;
        for(int j = 1 ; j <= p.length();j++){
            dp[0][j] = (p.charAt(j-1) == '*') && dp[0][j-1];
        }

        //Already UnderStood

        // for(int i = 1;i<s.length();i++){
        //     dp[i][0] = false;
        // }
        
    for(int i = 1;i<=s.length();i++){
        for(int j = 1 ; j <= p.length();j++){
        if(p.charAt(j-1)=='?' || s.charAt(i-1) == p.charAt(j-1)) dp[i][j] = dp[i-1][j-1];
        else if(p.charAt(j-1) == '*'){
            dp[i][j] = dp[i][j-1] || dp[i-1][j];
            }
        else dp[i][j] = false;
        }
     }
     return dp[s.length()][p.length()];
    }
}