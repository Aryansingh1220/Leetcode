class Solution {
    void fun(int open,int close,StringBuilder ds,List<String>result){
        if(close==0){
            result.add(ds.toString());
            return;
        }
        if(open>0){
            ds.append("(");
            fun(open-1,close,ds,result);
            ds.deleteCharAt(ds.length() - 1);
        }
        if(close>open){
             ds.append(")");
            fun(open,close-1,ds,result);
            ds.deleteCharAt(ds.length() - 1);
        }
    }
    public List<String> generateParenthesis(int n) {
        StringBuilder ds=new StringBuilder();
        List<String>result=new ArrayList<>();
        fun(n,n,ds,result);
        return result;
    }
}