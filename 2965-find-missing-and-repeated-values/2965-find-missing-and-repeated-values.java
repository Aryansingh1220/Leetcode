class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] arr=new int[2];
        int count=0;
        HashSet<Integer>set=new HashSet<>();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                // set.add(grid[i][j]);
                list.add(grid[i][j]);
                
            }
        }
        Collections.sort(list);
        for(int num:list){
            set.add(num);
        }
        
        int a=1;
        int n=set.size();
        int sum1=0;
        int sum2=0;
        for(int num:set){
            sum1+=num;
        }
        for(int i=0;i<list.size();i++){
            sum2+=list.get(i);
        }
        boolean flag=false;
        arr[0]=sum2-sum1;
        for(int i=0;i<n;i++){
            if(!set.contains(a)){
                arr[1]=a;
                flag=true;
            }
            a++;
        }
        if(!flag){
            arr[1]=n+1;
        }
        return arr;
    }
}