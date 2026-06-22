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
            if(set.containsKey(curr))
            {
                l = set.get(curr) + 1;
                r = l+1;
                set = new HashMap<>();
                set.put(s.charAt(l), l);
                currlen = 1;
            }
            else
            {
                set.put(s.charAt(r), r);
                r++;
                currlen++;
                if(currlen>maxlen)
                {
                    maxlen = currlen;
                }
            }
        }
        return maxlen;
    }
}