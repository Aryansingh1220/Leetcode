class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=0;
        int wind=0;
        int curr_sum=0;
        int xor_sum=0;
        while(right<n){
            curr_sum+=nums[right];
            xor_sum^=nums[right];
            if(curr_sum!=xor_sum){
                curr_sum-=nums[left];
                xor_sum^=nums[left];
                left++;
            }
            wind=Math.max(wind,right-left+1);
            right++;
        }
        return wind;
    }
}