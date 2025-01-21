class Solution {
    private void fun(int sum, int index, List<Integer> ds, List<List<Integer>> result, int[] nums, int target) {
        if (sum == target) {
            result.add(new ArrayList<>(ds));
            return;
        }
        if (index >= nums.length || sum > target) {
            return;
        }
        ds.add(nums[index]);
        fun(sum + nums[index], index, ds, result, nums, target);
        ds.remove(ds.size() - 1);
        fun(sum, index + 1, ds, result, nums, target);
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        fun(0, 0, ds, result, candidates, target);
        return result;
    }
}
