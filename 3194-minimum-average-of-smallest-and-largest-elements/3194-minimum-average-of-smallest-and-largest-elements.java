class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        double sum = Double.MAX_VALUE;
        for (int i = 0; i < n / 2; i++) {
            double currentSum = (nums[i] + nums[n - i - 1]) / 2.0;
            sum = Math.min(sum, currentSum);
        }
        return sum;
    }
}
