class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder("a");
        while( sb.length() < k){
            String s = Solve(sb.toString());
            sb.append(s);
        }
        System.out.println(sb.toString());
        return sb.charAt(k-1);
    }
    static String Solve(String s){
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i<sb.length() ;i++){
            char ch = sb.charAt(i);
            sb.setCharAt(i,++ch);
        }
        return sb.toString();
    }
}