class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int ans = 0;
        while(k > 0){
            if(numOnes > 0){
                numOnes--;
                ans++;
            }
            else if(numZeros > 0) numZeros--;
            else {
                 numNegOnes--;
                 ans--;
            }
            k--;
        }
        return ans;
    }
}