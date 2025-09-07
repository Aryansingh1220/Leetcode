class Solution {
    public int[] sumZero(int n) {
        int[]arr=new int[n];
        
        if(n%2!=0){
            arr[0]=0;
            int k=1;
            for(int i=1;i<n;i+=2){
                arr[i]=k;
                arr[i+1]=k*(-1);
                k++;
            }
        }
        else{
            int k=1;
            for(int i=0;i<n-1;i+=2){
                arr[i]=k;
                arr[i+1]=k*(-1);
                k++;
            }
        }
        return arr;
        

        
        
    }
}