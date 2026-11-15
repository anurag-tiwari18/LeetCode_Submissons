class Solution {
    public boolean canJump(int[] nums) {
        // int maxReach=nums[0];
        // for(int i=0;i<nums.length;i++){
        //     maxReach=Math.max(maxReach, i+nums[i]);
        //     if(maxReach>=nums.length-1) return true;
        //     else if(i>=maxReach) return false;
        // }
        // // return false;




        // Brute Force
        // if(nums.length==1) return true;
        // int i=0;
        // while(i<nums.length){
        //     int temp=nums[i];
        //     for(int j=0;j<temp;j++){
        //         i++;
        //         if(i==nums.length-1) return true;
        //     }
        //     if(i==nums.length-1) return true;            
        //     if(nums[i]==0) return false;
        // }
        // return false;
        
        Boolean[] dp = new Boolean[nums.length+1];
        Arrays.fill(dp,null);
        return solve(0,nums , dp);
    }
    static boolean solve(int i , int[] nums , Boolean[] dp){
        if(i == nums.length-1) return true;

        if(nums[i] == 0 || i >= nums.length) return false;

        if(dp[i] != null) return dp[i];

        boolean res = false;
        for(int k = 1 ; k <= nums[i] ;k++){
            res = (res || solve(i+k , nums,dp));
        }
        return dp[i] = res;
    }
}