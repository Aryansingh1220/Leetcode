class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
        int n=nums.length;
        int[] arr=new int[n];
        Arrays.fill(arr,0);
        ArrayList<Integer>list=new ArrayList<>();
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                list.add(nums[i]);
            }
            else{
                count++;
            }
        }
        for(int i=0;i<count;i++){
            list.add(0);
        }
        for(int i=0;i<n;i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}