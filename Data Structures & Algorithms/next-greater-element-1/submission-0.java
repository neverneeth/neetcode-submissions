// Non Neetcode. Refer Leetcode 496

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int[] ngei = new int[l2];
        int[] stack = new int[l2];
        int[] poshash = new int[10001];
        int top = -1;
        for(int i = 0; i<l2; i++)
        {
            int curr = nums2[i];
            poshash[curr] = i;
            while(top != -1 && curr > nums2[stack[top]])
            {
                ngei[stack[top]] = i - stack[top];
                top--;
            }
            stack[++top] = i;
        }
        int[] answer = new int[l1];
        for(int i = 0; i<l1; i++)
        {
            int curr = nums1[i];
            int pos = poshash[curr];
            int ahead = ngei[pos];
            if(ahead==0)
            {
                answer[i] = -1;
            }
            else
            {
                answer[i] = nums2[pos + ngei[pos]];
            }
        }
        return answer;
    }
}
