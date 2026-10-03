class Solution {
    public int coinChange(int[] coins, int amount) {

        int[][] dp = new int[coins.length+1][amount+1];

        for(int i = 0;i<coins.length+1;i++){
            for(int j = 0 ;j<amount+1;j++){
                if(i==0) dp[i][j] = Integer.MAX_VALUE-1;
                if(j==0) dp[i][j] = 0;
            }
        }

        //INTIALISING 2ND ROW
        for(int j = 1;j<amount+1;j++){
            if(j%coins[0] == 0) dp[1][j] = j/coins[0];

            else dp[1][j] = Integer.MAX_VALUE-1;
        }
        for(int i = 1;i<coins.length+1;i++){
            for(int j = 1 ;j<amount+1;j++){
                if(coins[i-1] <= j)

                dp[i][j] = Math.min(1+dp[i][j-coins[i-1]],dp[i-1][j]);

                else dp[i][j] = dp[i-1][j];
            }
        }

        return dp[coins.length][amount]==Integer.MAX_VALUE-1?-1:dp[coins.length][amount];


    //     for(int[] row : dp){
    //     Arrays.fill(row,-1);
    // }       
    //   int ans = fun(coins , amount ,0 , dp);
    //   return ans != Integer.MAX_VALUE ? ans : -1; 
    }
    static int fun(int[] coins , int amt , int i , int[][] dp){
        //base condition
        if(amt == 0) {
            return 0;
        }
        if(i == coins.length) return Integer.MAX_VALUE;

        if(dp[i][amt] != -1 ) return dp[i][amt];

        if(coins[i] <= amt){
            int pick = fun(coins , amt-coins[i] , i ,dp);

            int Notpick = fun(coins , amt , i+1 , dp);

            if(pick != Integer.MAX_VALUE)
              pick+=1;
              return dp[i][amt] =  Math.min(pick  , Notpick);          
        }
        else return dp[i][amt] = fun(coins , amt , i+1 , dp);
    }
    //     //base condition
    //     if(i == coins.length && amt !=0) return -1;

    //     if(i == coins.length || amt == 0) {
    //         return 0;
    //     }

    //     int pick =Integer.MAX_VALUE;

    //     if(coins[i] <= amt ){

    //     int temp = fun(coins , amt-coins[i], i);

    //     if(temp !=-1 ) pick = temp+1;

    //     else pick = temp;

    //     }        
    //     int Notpick = fun(coins , amt , i+1);

    //     if(Notpick == -1 && pick!=Integer.MAX_VALUE) return pick;

    //     return Math.min(pick , Notpick);
    // } static int fun(int[] coins , int amt , int i){
    //
}