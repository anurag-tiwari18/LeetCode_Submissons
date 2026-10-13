class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer ,Integer> mpp = new HashMap<>();
        for(int el : nums){
            mpp.put(el,mpp.getOrDefault(el,0)+1);
        }
        for(int key : mpp.keySet()){
            int value = mpp.get(key);
            if(prime(value)) return true;
        }
        return false;
    }
    static boolean prime(int n){
        if(n==1) return false;

        for(int i = 2 ;i*i < n*n;i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}