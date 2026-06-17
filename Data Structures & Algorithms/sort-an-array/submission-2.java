class Solution {
    public int[] sortArray(int[] nums) {
        int[] temp = new int[nums.length]; 
        mergesort(nums, temp, 0, nums.length-1);
        return nums;
    }
    public void mergesort(int[] nums, int[] temp, int l, int r)
    {
        if(l==r)
        {
            return;
        }
        else
        {
            int mid = (l+r)/2;
            mergesort(nums, temp, l, mid);
            mergesort(nums, temp, mid+1, r);
            int lp = l;
            int mp = mid+1;
            int k =l;
            while(lp<=mid && mp<=r)
            {
                if(nums[lp]<=nums[mp])
                {
                    temp[k] = nums[lp];
                    lp++;
                }
                else
                {
                    temp[k] = nums[mp];
                    mp++;
                }
                k++;
            }
            while(mp<=r)
            {
                temp[k] = nums[mp];
                mp++;
                k++;
            }
            while(lp<=mid)
            {
                temp[k] = nums[lp];
                lp++;
                k++;
            }
            for (int i = l; i <= r; i++) {
            nums[i] = temp[i];
            }
        }
    }
}