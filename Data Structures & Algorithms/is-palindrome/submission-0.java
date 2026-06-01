class Solution {
    public boolean isalnum(char ch)
    {
        return Character.isLetterOrDigit(ch);
    }

    public boolean isPalindrome(String s) {
        int len = s.length();
        s = s.toLowerCase();
        int l = 0;
        int r = len -1;
        while(l<=r)
        {
            if(!isalnum(s.charAt(l)))
            {
                l++;
            }
            else if (!isalnum(s.charAt(r)))
            {
                r--;
            }
            else
            {
                if(s.charAt(l) != s.charAt(r))
                {
                    return false;
                }
                l++;
                r--;
            }
        }
        return true;               
    }
}