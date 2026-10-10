class Solution {
    public int minimumSum(int num) {
        int[] digits = new int[4];
        int i =0;
        while(num >0){
            int ld = num%10;
            digits[i++] = ld;
            num/=10;
        }
        Arrays.sort(digits);
        int ans = 0; 
        int ones = digits[2]+digits[3];
        ans = ones % 10;
        int carry = ones /10;

        int tens = digits[0]+digits[1]+carry;

        ans = tens*10 + ans;
        return ans;
    }
}