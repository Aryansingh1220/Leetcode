class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        int sum1=0;
        int sum2=0;
        for(int i=low;i<=high;i++){
            String str=String.valueOf(i);
            char[] ans=str.toCharArray();
            if(ans.length%2!=0){
                continue;
            }
            sum1=0;
            sum2=0;
            int a=ans.length/2;
            for(int j=0;j<a;j++){
                int digit=ans[j]-'0';
                sum1+=digit;
            }
            for(int j=a;j<ans.length;j++){
                int digit=ans[j]-'0';
                sum2+=digit;
            }
            if(sum1==sum2){
                count++;
            }
            
        }
        return count;
    }
}