class Solution {

    
    public boolean isPalindrome(String s, int l, int r)
    {

            while(l<=r)
            {
                if(s.charAt(l) != s.charAt(r))
                {
                    return false;
                }
                else
                {
                    l++;
                    r--;
                }
            }
        return true;
    }

    public boolean validPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;
        int k = 0;
        if(isPalindrome(s, l, r))
        {
            return true;
        }
        else
        {
            while(l<=r)
            {
                if(s.charAt(l) == s.charAt(r))
                {
                    l++;
                    r--;
                }
                else
                {
                    if(isPalindrome(s, l, r-1) || isPalindrome(s, l+1, r) )
                    {
                        return true;
                    }
                    else
                    {
                        return false;
                    }
                }
            }   
        }
        return false;
    }
}