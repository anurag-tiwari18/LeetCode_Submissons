class Solution {
    public boolean canAliceWin(int n) {
        boolean alice = true;

        int take = 10;
        while(n >= take){
            if(alice){
                alice = false;
            }
            else alice = true;
                n = n - take;
                take--;
        }
        return alice!=true;
    }
}