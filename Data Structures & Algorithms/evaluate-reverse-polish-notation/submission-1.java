class Solution {
    public int evalRPN(String[] tokens) {
        int ulength = tokens.length; 
        int[] nums = new int[ulength];
        int top = 0;
        for(String s: tokens)
        {
            try
            {
                int i = Integer.parseInt(s);
                nums[top++] = i;
            }
            catch (Exception e)
            {
                char ch = s.charAt(0);
                int lop = nums[top-2];
                int rop = nums[top-1];
                top = top -2;
                if(ch == '+')
                {
                    nums[top++] = lop + rop;
                }
                else if (ch == '-')
                {
                    nums[top++] = lop - rop;
                }
                else if (ch == '*')
                {
                    nums[top++] = lop * rop;
                }
                else
                {
                    nums[top++] = lop / rop;
                }
            }
        }
        return nums[top-1];
    }
}