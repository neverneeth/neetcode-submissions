class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> checked = new HashMap<>();
        int l = nums.length;
        for(int i = 0; i<l; i++)
        {
            int diff = target-nums[i];
            if (checked.containsKey(diff)){
                return new int[]{checked.get(diff), i};
            }
            else{
                checked.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}