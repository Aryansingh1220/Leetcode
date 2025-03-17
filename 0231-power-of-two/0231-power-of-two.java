class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n<=0){
            return false;
        }
        int k=n&(n-1);
        if(k==0){
            return true;
        }
        return false;
    }
}