class Solution {
    static void fun(int[] nums,int left,int right){
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
    public void rotate(int[] arr, int k) {
        int n=arr.length;
        k%=n;
        fun(arr,0,n-1);
        fun(arr,0,k-1);
        fun(arr,k,n-1);
    }
}