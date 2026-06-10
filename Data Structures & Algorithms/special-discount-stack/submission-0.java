// Non NeetCode question. Refer Leetcode #1475
class Solution {
    public int[] finalPrices(int[] prices) {
        int length = prices.length;
        int[] stack = new int[length];
        int[] answer = new int[length];
        int top = -1;
        for(int i = length-1; i>=0; i--)
        {
            int curr = prices[i];
            if(top == -1)
            {
                answer[i] = curr;
                stack[++top] = curr;
            }
            else
            {
                while(top!= -1 && curr<stack[top])
                {
                    top--;
                }
                if(top == -1)
                {
                    answer[i] = curr;
                    stack[++top] = curr;
                }
                else
                {
                    answer[i] = curr-stack[top];
                    stack[++top] = curr;
                }
            }
        }
        return answer;
    }
}
