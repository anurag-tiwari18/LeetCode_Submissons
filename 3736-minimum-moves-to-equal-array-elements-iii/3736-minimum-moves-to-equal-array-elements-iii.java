class Solution {
    public int minMoves(int[] nums) {
        int max = 0;
        int sum =0;
        for(int el : nums){
            max = Math.max(el,max);
            sum+=el;
        }
        // int ans = 0;
        // for(int el: nums){
        //     ans+= max-el;
        // }
        // return ans;

        return max*nums.length - sum;
    }
}