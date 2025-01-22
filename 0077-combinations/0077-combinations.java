class Solution {
    void fun(int ind,List<Integer>ds,HashSet<List<Integer>>result,int n,int k){
        if(ds.size()==k){
            result.add(new ArrayList<>(ds));
        }
        if(ind>n){
            return;
        }
        ds.add(ind);
        fun(ind+1,ds,result,n,k);
        ds.remove(ds.size()-1);
        fun(ind+1,ds,result,n,k);
    }
    public List<List<Integer>> combine(int n, int k) {
        HashSet<List<Integer>>result=new HashSet<>();
        List<Integer>ds=new ArrayList<>();
        fun(1,ds,result,n,k);
        return new ArrayList<>(result);
    }
}