class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] dp = new int[costs.length];
        Arrays.fill(dp,-1);
        return Solve(-1,costs,dp);
    }
    static int Solve(int i , int[] costs ,int[] dp){

        if(i == costs.length-1) return 0;
        if(dp[i+1] != -1) return dp[i+1];

        int x = Integer.MAX_VALUE;
        if(i+1 <= costs.length-1)  x = Solve(i+1 , costs, dp) + 1 + costs[i+1];

        int y = Integer.MAX_VALUE;
        if(i+2 <= costs.length-1)  y = Solve(i+2 , costs, dp) + 4 + costs[i+2];

        int z = Integer.MAX_VALUE;
        if(i+3 <= costs.length-1)  z = Solve(i+3 , costs, dp) + 9 + costs[i+3];

        return dp[i+1] = Math.min(x,Math.min(y,z));
    }
}