class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        int mid = nums.length/2;

        for(int el : nums){
            ans += Math.abs(el-nums[mid]);
        }
        return ans;
    }
}