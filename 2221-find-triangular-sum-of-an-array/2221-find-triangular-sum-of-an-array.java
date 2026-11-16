class Solution {
    public int triangularSum(int[] nums) {
        return solve(nums , nums.length-1);
    }
    static int solve(int[] nums , int i){
        if(i == 0) return nums[0];

        for(int k=0 ; k < i ; k++){
            nums[k] = (nums[k]+nums[k+1]) % 10;
        }
        return solve(nums,i-1);
    }
}