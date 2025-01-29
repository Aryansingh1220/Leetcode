class Solution {
    int[][] dp;
    int fun(int ind, int prev, int[] nums) {
        if (ind >= nums.length) {
            return 0;
        }
        if (dp[ind][prev + 1] != -1) {
            return dp[ind][prev + 1];
        }
        int notTake = fun(ind + 1, prev, nums);
        int take = 0;
        if (prev == -1 || nums[ind] > nums[prev]) {
            take = 1 + fun(ind + 1, ind, nums);
        }

        return dp[ind][prev + 1] = Math.max(notTake, take);
    }

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        dp = new int[n][n + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return fun(0, -1, nums);
    }
}
