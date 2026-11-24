class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int turn = 0;

        Arrays.sort(happiness);

        int i = happiness.length-1;

        long ans = 0;
        while(turn != k){
            if(happiness[i] > turn) ans += (happiness[i] - turn);

            i--;
            turn++;
        }
        return ans;
    }
}