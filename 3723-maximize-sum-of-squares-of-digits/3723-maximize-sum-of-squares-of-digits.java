class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder sb = new StringBuilder();
         int nines = sum / 9;
         int rem = sum % 9;
         if(nines >= num && rem != 0) return "";

         while(nines > 0){
            sb.append("9");
            nines--;
            num--;
         }
         if(num > 0){
         sb.append(String.valueOf(rem));
         num--;            
         }
         while(num > 0){
            sb.append("0");
            num--;
         }

        //Appraoch 1

        // while (num > 0) {
        //     if (sum == 0)
        //         sb.append("0");
        //     else if (sum > 9) {
        //         if (num > 1) {
        //             sb.append("9");
        //             sum -= 9;
        //         } else
        //             return "";
        //     } else if (sum <= 9) {
        //         // String s = String.valueOf(sum);
        //         sb.append(String.valueOf(sum));
        //         sum = 0;
        //     }

        //     num--;
        // }
        return sb.toString();
    }
}