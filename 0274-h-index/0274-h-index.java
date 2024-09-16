class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length-1;
        if(n<1 && citations[0]==0){
            return 0;
        }
        if(n<=2){
            return 1;
        }
        Arrays.sort(citations);
        int a=0;
        int count=1;
        for(int i=0;i<n;i++){
            if(count==citations[i]){
                a=citations[i];
            }
            count++;
        }
        return a;
    }
}