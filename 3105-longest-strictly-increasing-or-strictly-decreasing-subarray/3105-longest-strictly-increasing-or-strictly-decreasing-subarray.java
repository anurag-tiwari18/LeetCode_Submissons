class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        return Math.max(Incr(nums) , Decr(nums));
    }
    static int Incr(int[] nums){
        int i = 0;
        int j = 1;

        int len = 1;

        int ans = 1;

        while(j < nums.length){
            if(nums[j] > nums[i]) {
                len++;
            }
            else{
                len = 1;
            }
                ans = Math.max(ans , len);
                i++;
                j++;
        }
        return ans;
    }
    static int Decr(int[] nums){
        int i = 0;
        int j = 1;

        int len = 1;

        int ans = 1;

        while(j < nums.length){
            if(nums[i] > nums[j]) {
                len++;
            }
            else{
                len = 1;
            }
                ans = Math.max(ans , len);
                i++;
                j++;
        }
        return ans;
    }
}