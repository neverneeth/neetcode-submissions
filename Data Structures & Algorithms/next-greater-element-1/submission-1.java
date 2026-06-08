// Non Neetcode. Refer Leetcode 496

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] map = new int[10001]; 
        int[] stack = new int[nums2.length];
        int top = -1;
        
        for (int i = 0; i < nums2.length; i++) {
            int curr = nums2[i];
            
            while (top != -1 && curr > stack[top]) {
                map[stack[top]] = curr; 
                top--;
            }
            stack[++top] = curr;
        }
        
        int[] answer = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int curr = nums1[i];
            answer[i] = map[curr] == 0 ? -1 : map[curr];
        }
        
        return answer;
    }
}
