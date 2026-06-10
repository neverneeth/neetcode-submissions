class Solution {
    public int largestRectangleArea(int[] heights) {
        int length = heights.length;
        int[] stack = new int[length + 1]; 
        int top = -1;
        int maxArea = 0;
        
        for (int i = 0; i <= length; i++) {
            int currHeight = (i == length) ? 0 : heights[i];
            while (top != -1 && currHeight < heights[stack[top]]) {
                int heightOfPoppedBar = heights[stack[top]];
                top--; 
                int width;
                if (top == -1) {
                    width = i;
                } else {
                    width = i - stack[top] - 1;
                }
                
                maxArea = Math.max(maxArea, heightOfPoppedBar * width);
            }            
            stack[++top] = i;
        }
        
        return maxArea;
    }
}