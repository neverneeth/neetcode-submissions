class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int l = nums.length;
        for(int i = 0; i<l; i++)
        {
            if(nums[i]==val)
            {
                k++;
            }
        }
        for(int i = 0; i<l; i++)
        {
            if(nums[i] == val)
            {
                for(int j = i; j<l-1; j++)
                {
                    nums[j] = nums[j+1];
                }
                i--;
                l--;
            }
        }
        return l;
    }
}