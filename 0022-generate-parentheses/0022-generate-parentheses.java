class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        int open=n;
        int close=n;
        String op="";
        solve(open,close,op,ans);
        return ans;
    }
    static void solve(int open , int close , String op , List<String> ans){
        //Base condition
        if(open==0 && close==0){
            ans.add(op);
            return;
        }
        
        //open bracket always available till open !=0
        if(open != 0) solve(open-1,close,op+"(",ans);

        //close brackets only avialable when close > open
        if(close > open)
        solve(open,close-1,op+")",ans);
    }
}