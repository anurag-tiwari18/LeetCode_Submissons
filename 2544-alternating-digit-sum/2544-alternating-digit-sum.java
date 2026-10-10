class Solution {
    public int alternateDigitSum(int n) {
        int rev = 0;
        while(n>0){
            rev = rev *10 + n%10;
            n /=10;
        }
        int ans = 0;
        boolean flag = false;
        while( rev > 0){
            int ld = rev % 10;

            if(flag){
                ans -= ld;
                flag = false;
            }
            else {
                ans += ld;
                flag = true;
            }

            rev /= 10;
        }

        return ans;
    }
}