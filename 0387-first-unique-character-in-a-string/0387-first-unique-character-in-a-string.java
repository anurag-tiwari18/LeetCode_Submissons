class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> mp= new HashMap<>();
        for(int i=0; i<s.length();i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
        char target=' ';
        for(int i=0;i<s.length();i++){
            if(mp.get(s.charAt(i))==1){
                 target=s.charAt(i);
                 break;
            }
        }
        for(int i=0;i<s.length();i++){
             if(s.charAt(i)==(target)) return i;
        }
        return -1;
    }
}