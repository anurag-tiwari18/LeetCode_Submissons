class Solution {
    public double average(int[] salary) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int el : salary){
            sum+=el;
            min= Math.min(min ,el);
            max = Math.max(max , el);
        }
        return (double) (sum - (max + min)) / (salary.length-2);
    }
}