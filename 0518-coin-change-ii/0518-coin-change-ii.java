class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length][amount+1];
        for(int[] row : dp){
            Arrays.fill(row ,-1);
        }
        return fun(coins , amount , 0 , dp);
    }
    static int fun(int[] coins , int amt , int i ,int[][] dp){
        //base cond
        if(amt == 0) return 1;

        else if (i == coins.length && amt != 0) return 0;
        
        if(dp[i][amt] != -1) return dp[i][amt];
        

        int pick=0;
        if(coins[i]<=amt){

        pick = fun(coins , amt-coins[i] , i , dp);

        // int Notpick = fun(coins , amt , i+1, dp);

        }
        // else return dp[i][amt] = fun(coins , amt ,i+1  , dp);
        
        int Notpick = fun(coins , amt , i+1, dp);
        return dp[i][amt] = pick+Notpick;            
    }
}