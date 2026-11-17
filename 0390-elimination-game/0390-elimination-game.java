class Solution {
    public int lastRemaining(int n) {
        boolean left = true;
        int head = 1;
        int step = 1;
        while(n > 1){
            if(left || (n%2 != 0)){
                head = head + step;
            }
            n/=2;
            step*=2;
            left =!left;
        }
        return head;
    }
}