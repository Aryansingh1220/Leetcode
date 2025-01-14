class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>nums[high]){
                low=mid+1;
            }
            else if(nums[mid]<nums[low]){
                high=mid;
            }
            // else if(nums[mid]<nums[mid+1] && nums[mid]<nums[mid-1]){
            //     return nums[mid];
            // }
            else{
                high--;
            }
        }
        return nums[low];
    }
}