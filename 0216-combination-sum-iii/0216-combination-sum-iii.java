class Solution {
    void fun(int ind,List<Integer>ds,List<List<Integer>>result,int k,int n){
        if(ds.size()==k){
            if(n==0){
                result.add(new ArrayList<>(ds));
            }
            return;
        }
        if(ind >9){
            return;
        }
        fun(ind+1,ds,result,k,n);
        ds.add(ind);
        fun(ind+1,ds,result,k,n-ind);
        ds.remove(ds.size()-1);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>result=new ArrayList<>();
        List<Integer>ds=new ArrayList<>();
        fun(1,ds,result,k,n);
        return result;
    }
}