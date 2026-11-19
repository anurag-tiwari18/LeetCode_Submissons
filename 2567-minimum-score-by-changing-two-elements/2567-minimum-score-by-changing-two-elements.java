class Solution {
    public int minimizeSum(int[] nums) {
        int n = nums.length-1;
        Arrays.sort(nums);
        int case1 = Math.abs(nums[n-1]-nums[1]);
        int case2 = Math.abs(nums[n-2]-nums[0]);
        int case3 = Math.abs(nums[n]-nums[2]);

        return Math.min(case1 , Math.min(case2 , case3));
    }
}