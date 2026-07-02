class Solution {
    public List<Integer> subset = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        getSubs(res, nums, 0);
        return res;
    }
    public void getSubs(List<List<Integer>> res, int[] nums, int ind)
    {
        if(ind>=nums.length)
        {
            res.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[ind]);
        getSubs(res, nums, ind+1);

        subset.remove(subset.size()-1);
        getSubs(res, nums, ind+1);
    }
}