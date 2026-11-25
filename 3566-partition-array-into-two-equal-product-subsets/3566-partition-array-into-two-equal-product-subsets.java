class Solution {
    public boolean checkEqualPartitions(int[] nums, long target) {
        long prod = 1;
        for(int el : nums){
            prod *=el;
        }
        if(prod != target*target) return false;
        return Solve(nums , target , 1 , 0);
    }
    static boolean Solve(int[] nums , long target , long curr , int i){
        if(curr == target) return true;

        if( curr > target || i == nums.length) return false;

        if(target % nums[i] != 0) return Solve(nums , target , curr , i+1);

        boolean take = false;
            if (curr <= target / nums[i]) {
            take = Solve(nums, target,
                         curr * nums[i], i + 1);
        }

        boolean notTake = Solve(nums , target , curr , i+1);     
        return take || notTake;
    }
}