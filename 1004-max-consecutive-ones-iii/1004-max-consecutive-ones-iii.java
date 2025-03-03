class Solution {
    public int longestOnes(int[] nums, int k) {
        int max=0;
        int i=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]==0){
                k--;
            }
            if(k<0){
                if(nums[max]==0){
                    k++;
                }
                max++;
            }

        }
        return i-max;  
    }
}