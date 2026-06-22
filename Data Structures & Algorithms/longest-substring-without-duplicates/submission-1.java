class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if(len<=0)
        {
            return 0;
        }
        int l = 0;
        int r = 1;
        int maxlen = 1;
        int currlen = 1;
        HashMap<Character, Integer> set = new HashMap<>();
        set.put(s.charAt(0), 0);
        while(r<len)
        {
            char curr = s.charAt(r);
            if (set.containsKey(curr) && set.get(curr) >= l) {
                l = set.get(curr) + 1;
            }
            set.put(curr, r);
            maxlen = Math.max(maxlen, r-l+1);
            r++;
        }
        return maxlen;
    }
}