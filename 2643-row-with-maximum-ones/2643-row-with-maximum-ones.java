class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] ans = new int[2];
        int maxCnt = 0;
        for(int i = 0 ; i < mat.length ; i++){
            int cnt = 0;
            for(int j = 0 ; j < mat[0].length ; j++){
                if(mat[i][j] == 1) cnt++; 
            }
            if(cnt > maxCnt){
                maxCnt = cnt;
                ans[0]=i;
                ans[1]= maxCnt;
            }
        }

        return ans;
    }
}