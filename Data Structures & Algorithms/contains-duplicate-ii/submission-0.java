class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int l = nums.length;
        for(int i = 0; i<l; i++)
        {
            int curr = nums[i];
            if(map.containsKey(curr))
            {
                if(i - map.get(curr) <= k)
                {
                    return true;
                }
                else
                {
                    map.replace(curr, i);
                }
            }
            else
            {
                map.put(curr, i);
            }
        }
        return false;
    }
}