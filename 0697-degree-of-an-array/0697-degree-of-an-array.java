class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap <Integer ,Integer > mpp = new HashMap<>();
        HashMap <Integer ,Integer > srt = new HashMap<>();
        HashMap <Integer ,Integer > lst = new HashMap<>();
        int max = 0;
        int ans  = -1;
        for(int i = 0;i< nums.length ;i++){
            mpp.put(nums[i] , mpp.getOrDefault(nums[i],0)+1);
            max = Math.max(max , mpp.get(nums[i]));

            if(!srt.containsKey(nums[i])) srt.put(nums[i],i);

            lst.put(nums[i],i);
        }

        int min = nums.length;
        for(int k : mpp.keySet()){
            if(mpp.get(k) == max){
                int len = lst.get(k) - srt.get(k)+1;
                min = Math.min(min , len);
            }
        }
        return min;
    }
}