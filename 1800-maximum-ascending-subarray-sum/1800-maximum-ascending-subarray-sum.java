class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum=nums[0];
        int curr=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                curr+=nums[i];
            }
            else{
                sum=Math.max(curr,sum);
                curr=nums[i];
            }
        }
        return Math.max(curr,sum);
    }
}