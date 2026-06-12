class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int l = strs.length;
        if (strs == null || l == 0) {
            return "";
        }
        int i = 0;
        int check = 1;
        while(check==1)
        {
            if(i==strs[0].length())
            {
                return strs[0].substring(0, i);
            }
            char ch = strs[0].charAt(i);
            for(int j = 1; j<l; j++)
            {
                if(i==strs[j].length() || strs[j].charAt(i) != ch)
                {
                    return strs[0].substring(0, i);
                }
            }
            i++;
        }
        return strs[0].substring(0, i);
    }
}