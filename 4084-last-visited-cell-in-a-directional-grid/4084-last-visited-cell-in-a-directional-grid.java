class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
 boolean[][] visited = new boolean[m][n];

        int r = 0, c = 0;
        int Lr = 0, Lc = 0;

        while (r >= 0 && r < m && c >= 0 && c < n
                && !visited[r][c]) {

            visited[r][c] = true;
            Lr = r;
            Lc = c;

            if (grid[r][c] == 'R') c++;
            else if (grid[r][c] == 'L') c--;
            else if (grid[r][c] == 'U') r--;
            else if (grid[r][c] == 'D') r++;
            else break;
        }
        return new int[]{Lr,Lc};
    }
}