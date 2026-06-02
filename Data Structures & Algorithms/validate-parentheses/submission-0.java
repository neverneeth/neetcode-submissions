class Solution {
    public boolean isValid(String s) {
        int l = s.length();
        char[] stack = new char[l];
        int top = -1;
        for(int i = 0; i<l; i++)
        {
            char ch = s.charAt(i);
            if(ch =='(' || ch=='{' || ch=='[')
            {
                stack[++top] = ch;
            }
            else
            {
                if(top==-1)
                {
                    return false;
                }
                char topc = stack[top];
                if((ch==')' && topc =='(') || (ch=='}' && topc =='{') || (ch==']' && topc =='['))
                {
                    top--;
                }
                else
                {
                    return false;
                }
            }
        }
        if(top==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}