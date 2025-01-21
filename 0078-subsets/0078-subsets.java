class Solution {
    private void fun(int index,List<Integer> ds,List<List<Integer>> result,int[] nums){
        if(index>=nums.length){
            result.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[index]);
        fun(index+1,ds,result,nums);
        ds.remove(ds.size()-1);
        fun(index+1,ds,result,nums);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer>ds=new ArrayList<>();
        fun(0,ds,result,nums);
        return result;
    }
}