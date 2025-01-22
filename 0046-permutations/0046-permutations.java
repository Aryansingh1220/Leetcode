class Solution {
    void fun(int ind, List<Integer> ds, List<List<Integer>> result, int[] nums) {
        if (ds.size() == nums.length) {
            result.add(new ArrayList<>(ds));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (ds.contains(nums[i])) continue; 
            ds.add(nums[i]);
            fun(ind + 1, ds, result, nums);
            ds.remove(ds.size() - 1); 
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        fun(0, ds, result, nums);
        return result;
    }
}
