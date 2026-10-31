class Solution {
    public int uniquePaths(int[][] grid) {
        int[][][] dp = new int[grid.length][grid[0].length][2];
        for(int[][] row : dp){
            for(int[] r : row){
                Arrays.fill(r,-1);
            }
        }
       return Solve(grid , 0 , 0 , 0 ,dp); 
    }
    static int Solve(int[][] grid , int i , int j , int dir , int[][][] dp){
        if(i > grid.length-1 || j > grid[0].length-1) return 0;

        else if(i == grid.length-1 && j == grid[0].length-1) return 1;
        
        if(dp[i][j][dir] != -1) return dp[i][j][dir];
    
        if(grid[i][j] == 1) {
            if(dir == 1){
            //right se mirror
            // toh down kr do
            return dp[i][j][dir] = Solve(grid , i+1 , j , 0,dp) % (int)(1e9+7);                
            }
            
            else {
            return dp[i][j][dir] = Solve(grid , i, j+1 , 1,dp) % (int)(1e9+7);
            }
        }

        int right = Solve(grid , i , j+1 , 1,dp);
        int down = Solve(grid , i+1 , j , 0,dp);

        return dp[i][j][dir]=(right+down) % (int)(1e9+7);
    }
}