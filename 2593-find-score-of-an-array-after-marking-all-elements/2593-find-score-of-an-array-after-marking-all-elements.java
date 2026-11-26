class Solution {
    public long findScore(int[] nums) {
        int n = nums.length;
        boolean[] marked = new boolean[n];

        long score = 0;

        int[][] arr = new int[nums.length][2];

        for(int i = 0 ; i< nums.length ; i++){
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        Arrays.sort(arr , (a,b) ->{
            if(a[0] != b[0]) return Integer.compare(a[0],b[0]);

            else return Integer.compare(a[1],b[1]);
        });

        for(int i = 0 ; i< arr.length; i++){
            if(!marked[arr[i][1]]){
            score += arr[i][0];
            marked[arr[i][1]] = true;
            if(arr[i][1] > 0) marked[arr[i][1]-1] = true;
            if(arr[i][1] < n-1) marked[arr[i][1]+1] = true;                
            }
        }

        return score;

        // for (int count = 0; count < n; count++) {

        //     int min = Integer.MAX_VALUE;
        //     int idx = -1;

        //     // Find smallest unmarked element
        //     for (int i = 0; i < n; i++) {
        //         if (!marked[i] && nums[i] < min) {
        //             min = nums[i];
        //             idx = i;
        //         }
        //     }

        //     // If no unmarked element exists
        //     if (idx == -1) break;

        //     score += nums[idx];

        //     // Mark current and adjacent indices
        //     marked[idx] = true;

        //     if (idx > 0) {
        //         marked[idx - 1] = true;
        //     }

        //     if (idx < n - 1) {
        //         marked[idx + 1] = true;
        //     }
        // }

        // return score;
    }
}