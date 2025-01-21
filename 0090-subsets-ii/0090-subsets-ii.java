class Solution {
    private void fun(int ind,List<Integer>ds,HashSet<List<Integer>>result,int[]nums){
        if(ind>=nums.length){
            result.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[ind]);
        fun(ind+1,ds,result,nums);
        ds.remove(ds.size()-1);
        fun(ind+1,ds,result,nums);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> result = new HashSet<>();
        List<Integer> ds = new ArrayList<>();
        fun(0, ds, result, nums);
        return new ArrayList<>(result);
    }
}