class Solution {
    private void fun(int sum, int ind, List<Integer> ds, List<List<Integer>> result, int[] nums, int target) {
        if (sum == target) {
            result.add(new ArrayList<>(ds));
            return;
        }
        if (ind >= nums.length || sum > target) {
            return;
        }
        ds.add(nums[ind]);
        fun(sum + nums[ind], ind + 1, ds, result, nums, target);
        ds.remove(ds.size() - 1);
        while (ind + 1 < nums.length && nums[ind] == nums[ind + 1]) {
            ind++;
        }
        fun(sum, ind + 1, ds, result, nums, target);
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        fun(0, 0, ds, result, candidates, target);
        return result;
    }
}
