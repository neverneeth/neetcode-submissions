class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int l = temperatures.length;
        int[] answer = new int[l];
        int[] stack = new int[l];
        int top = -1; 
        
        for (int i = 0; i < l; i++) {
            int curr = temperatures[i];
            
            while (top > -1 && curr > temperatures[stack[top]]) {
                int pastDayIndex = stack[top]; 
                top--;                         
                
                answer[pastDayIndex] = i - pastDayIndex; 
            }
            
            top++;
            stack[top] = i;
        }
        
        return answer;
    }
}