class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(numOnes >= k) return k;

        else if(numOnes + numZeros >= k) return numOnes;

        else return numOnes - (k - (numOnes+numZeros));


        // int ans = 0;
        // while(k > 0){
        //     if(numOnes > 0){
        //         numOnes--;
        //         ans++;
        //     }
        //     else if(numZeros > 0) numZeros--;
        //     else {
        //          numNegOnes--;
        //          ans--;
        //     }
        //     k--;
        // }
        // return ans;
    }
}