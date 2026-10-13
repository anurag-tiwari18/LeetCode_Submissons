class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            nums[i] = Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length-1;
        long score = 0;
        boolean flag = true;
        while(i<=j){
            if(flag){
                score += (long)nums[j]*nums[j];
                j--;
                flag = false;
            }
            else{
                score -= (long)nums[i]*nums[i];
                i++;
                flag = true;
            }
        }
        return score;
    }
}