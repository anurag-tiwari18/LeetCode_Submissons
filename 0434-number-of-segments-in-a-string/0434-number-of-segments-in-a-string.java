class Solution {
    public int countSegments(String s) {
        s = s.trim();
        if(s.equals("") ) return 0;
        int segment = 1;
        for(int i =0 ;i < s.length() ;i++){
            if(i > 0 && s.charAt(i-1)!= ' ' && s.charAt(i) == ' ') segment++;
        }
        return segment;
    }
}