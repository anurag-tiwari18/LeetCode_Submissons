class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int ans = numBottles;
        int generated = 0;
        while(numBottles >= numExchange){
            ans++;
            generated++;
            numBottles -= numExchange;
            numExchange++;
            if(numBottles <= numExchange){
                numBottles += generated;
                generated = 0;
            }
        }
        return ans;
    }
}