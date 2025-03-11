class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]>list=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int[] arr=intervals[0];
        list.add(arr);
        for(int i=1;i<intervals.length;i++){
            if(arr[1]>=intervals[i][0]){
                arr[1]=Math.max(arr[1],intervals[i][1]);
            }
            else{
                arr=intervals[i];
                list.add(arr);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}