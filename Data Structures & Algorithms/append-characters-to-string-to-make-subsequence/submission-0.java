class Solution {
    public int appendCharacters(String s, String t) {
        int slen = s.length();
        int tlen = t.length();
        int count = 0;
        int i = 0;
        while(i<slen && count < tlen)
        {
            if(s.charAt(i) == t.charAt(count))
            {
                count++;
            }
            i++;
        }
        return tlen-count;   
    }
}