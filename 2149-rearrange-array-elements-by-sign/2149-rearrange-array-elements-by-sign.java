class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                list1.add(nums[i]);
            }
            else{
                list2.add(nums[i]);
            }
        }
        int[] ans=new int[nums.length];
        ArrayList<Integer>temp=new ArrayList<>();
        // Collections.fill(temp, 0);
        int a=0;
        int b=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                temp.add(list1.get(a));
                a++;
            }
            else{
                temp.add(list2.get(b));
                b++;
            }
        }
        for(int i=0;i<nums.length;i++){
            ans[i]=temp.get(i);
        }
        return ans;
    }
}