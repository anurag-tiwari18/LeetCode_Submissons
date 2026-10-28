class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int[][] dp = new int[dungeon.length][dungeon[0].length];
        for(int[] row : dp){
            Arrays.fill(row , -1);
        }
        // return solve(0 , 0 , dungeon ,dp);

        return tab(dungeon);
    }
    static int solve(int i , int j , int[][] grid , int[][] dp){
        if(i >= grid.length || j >= grid[0].length) return Integer.MAX_VALUE;

        if(i == grid.length-1 && j == grid[0].length-1){
            if(grid[i][j] < 0) return 1 - grid[i][j];
            else return 1;
        }

        if(dp[i][j] != -1) return dp[i][j];

        int right = solve( i , j+1 , grid ,dp);

        int down = solve(i+1 , j , grid , dp);

        int demand = Math.min(right , down) - grid[i][j];

        if(demand > 0) return dp[i][j] = demand;

        //isme equals to zero wala bhi condition hai

        else return dp[i][j] = 1;

    }

    static int tab(int[][] grid){
        int[][] dp = new int[grid.length][grid[0].length];

        int m = grid.length;
        int n = grid[0].length;

        dp[m-1][n-1] = Math.max(1 , 1 - grid[m-1][n-1]);

        //Last Column 
        for(int i = m-2 ; i >= 0 ;i--){
            dp[i][n-1] = Math.max(1,dp[i+1][n-1]-grid[i][n-1]);
        }

        //Last Row
        for(int j = n-2 ; j >= 0 ;j--){
            dp[m-1][j] = Math.max(1,dp[m-1][j+1]-grid[m-1][j]);
        }

        for(int i = m -2 ;i >=0 ; i--){
            for(int j = n-2 ;j >= 0 ;j--){
                int right = dp[i][j+1];
                int down = dp[i+1][j];

                int temp = Math.min(right , down) - grid[i][j];
                 if(temp > 0) dp[i][j] = temp;

                 else dp[i][j] = 1;
            }
        }

        return dp[0][0];
    }
}