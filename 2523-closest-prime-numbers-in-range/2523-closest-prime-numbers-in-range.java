class Solution {
    public int[] closestPrimes(int left, int right) {
        ArrayList<Integer>list=new ArrayList<>();
        boolean[] arr=new boolean[right+1];
        Arrays.fill(arr,true);
        arr[0]=false;
        arr[1]=false;
        for(int i=2;i<=right;i++){
            if(arr[i]){
                if(i>=left){
                    list.add(i);
                }
            }
            for(int j=2*i;j<=right;j+=i){
                arr[j]=false;
            }
        }
        if(list.size()<2){
            return new int[]{-1,-1};
        }
        int min=Integer.MAX_VALUE;
        int[] result={-1,-1};
        for(int i=1;i<list.size();i++){
            int dif=list.get(i)-list.get(i-1);
            if(dif<min){
                min=dif;
                result[0]=list.get(i-1);
                result[1]=list.get(i);
            }
        }
        return result;
    }
}