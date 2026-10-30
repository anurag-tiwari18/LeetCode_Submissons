class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0 ;

        for(int el : nums){
            sum+=el;
        }
        if(sum %2 != 0) return false;

        sum/=2;
        Boolean[][] dp = new Boolean[nums.length][sum+1];

        for(Boolean[] row : dp){
            Arrays.fill(row , null);
        }
        return fun(nums , sum , 0 , dp);
    }

    //ye gadbad solution the kyuki ye 2 subset ka sum check kr rha hai 
    
    // static boolean fun(int[] nums , int i , int sum , Set<Integer> set){
    //     //base condition
    //     if( i == nums.length ){
    //         boolean ans = set.contains(sum);
    //         set.add(sum);
    //         return ans;
    //     }

    //     //pick
    //     boolean pick = fun(nums , i+1 , sum + nums[i] , set );

    //     //not pick
    //     boolean Notpick = fun(nums , i+1 , sum , set );

    //     return pick || Notpick;
    // }
    static boolean fun(int arr[], int sum , int i , Boolean [][] dp){
        //bc 
        if(sum == 0) return true;
        if(i == arr.length) return false;
        
        if(dp[i][sum] != null) return dp[i][sum];

        if(arr[i] > sum) return dp[i][sum] = fun(arr , sum , i+1, dp);
        
        return dp[i][sum] = fun(arr , sum-arr[i], i+1, dp) || fun(arr, sum , i+1 ,dp);
    }    
}