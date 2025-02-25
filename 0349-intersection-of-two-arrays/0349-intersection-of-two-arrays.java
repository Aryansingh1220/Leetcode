class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer>list=new ArrayList<>();
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums1){
            list.add(num);
        }
        for(int i=0;i<nums2.length;i++){
            if(list.contains(nums2[i])){
                set.add(nums2[i]);
            }
        }
        int n=set.size();
        int[]ans=new int[n];
        int i=0;
        for(int num:set){
            ans[i++]=num;
        }
        return ans;
        
    }
}