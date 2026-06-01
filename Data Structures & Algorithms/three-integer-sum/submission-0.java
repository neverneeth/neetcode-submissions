class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        int prev = -1;
        for(int i = 0; i< len; i++)
        {
            int curr = nums[i];
            int target = -curr;
            if(i!=0 && curr == prev)
            {
                continue;
            }
            int l = i+1;
            int r = len-1;
            while(l<r)
            {
                if(nums[l] + nums[r] <target)
                {
                    l++;
                }
                else if(nums[l] + nums[r] > target)
                {
                    r--;
                }
                else
                {
                    List<Integer> out = new ArrayList<>();
                    out.add(curr);
                    out.add(nums[l]);
                    out.add(nums[r]);
                    result.add(out);
                    l++;
                    r--;
                    while(l<r && nums[l] == nums[l-1])
                    {
                        l++;
                    }
                    while(r>l && nums[r] == nums[r+1])
                    {
                        r--;
                    }
                }
            }
            prev = curr;
        }
        return result;
    }
}