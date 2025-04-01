class Solution {
    void fun(ArrayList<ArrayList<Integer>> result, int[] nums) {
    int n = nums.length;
    for (int i = 0; i < n; i++) { 
        ArrayList<Integer> ds = new ArrayList<>();
        for (int j = i; j < n; j++) { 
            ds.add(nums[j]); 
            result.add(new ArrayList<>(ds));
        }
    }
}
    public int maxProduct(int[] nums) {
        ArrayList<ArrayList<Integer>>result=new ArrayList<>();
        // ArrayList<Integer>ds=new ArrayList<>();
        fun(result,nums);
        int product=Integer.MIN_VALUE;
        for(int i=0;i<result.size();i++){
            int ans=1;
            for(int j=0;j<result.get(i).size();j++){
                ans*=result.get(i).get(j);
            }
            product=Math.max(product,ans);
        }
        return product;
    }
}