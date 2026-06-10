class Solution {
    public boolean isSubsequence(String s, String t) {
        int count = 0;
        int length = s.length();
        int tlength = t.length();
        int i = 0;
        while (i<length && count<tlength)
        {
            char c1 = s.charAt(i);
            char c2 = t.charAt(count);
            if(c1 == c2)
            {
                i++;
            }
            count++;
        }
        return i == length;
    }
}