class Solution {
    public int rearrangeCharacters(String s, String target) {
        HashMap<Character, Integer> mpp1 = new HashMap<>();
        for (char el : target.toCharArray()) {
            mpp1.put(el, mpp1.getOrDefault(el, 0) + 1);
        }

        HashMap<Character, Integer> mpp2 = new HashMap<>();
        for (char el : s.toCharArray()) {
            mpp2.put(el, mpp2.getOrDefault(el, 0) + 1);
        }

        int min = Integer.MAX_VALUE;
            for (char el : mpp1.keySet()) {
                if (mpp2.containsKey(el))
                    min = Math.min(min, mpp2.get(el) / mpp1.get(el));
                else
                    return 0;
            }
        return min;
    }
}