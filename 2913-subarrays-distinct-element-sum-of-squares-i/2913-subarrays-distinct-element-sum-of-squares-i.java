class Solution {
    public int sumCounts(List<Integer> nums) {
        int sqr = nums.size();
        for(int i = 0 ; i < nums.size() ;i++){
            Set<Integer> st = new HashSet<>();
            st.add(nums.get(i));
            int distinct = 1;
            for( int j = i+1; j<nums.size() ; j++){
                if(!st.contains(nums.get(j))) distinct++;
                st.add(nums.get(j));
                sqr += distinct*distinct;
            }
        }

        return sqr;
    }
}