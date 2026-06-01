class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] leftprods = new int[n];
        leftprods[0] = 1;
        int left;
        for(int i = 1; i<n; i++)
        {
            left = nums[i-1];
            leftprods[i] = leftprods[i-1] * left;
        }
        int rightprods = 1;
        for(int i = n-1; i>=0; i--)
        {
            leftprods[i] *= rightprods;
            rightprods *= nums[i];
        }
        return leftprods;
    }
}