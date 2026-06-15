class Solution {
    public int majorityElement(int[] nums) {
        int l = nums.length;
        int rfreq = l/2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<l; i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i], 1);
            }
            int freq = map.get(nums[i]);
            if(freq > rfreq)
            {
                return nums[i];
            }
            map.replace(nums[i], ++freq);
        }
        return -1;
    }
}