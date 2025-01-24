class Solution {
    int fun(int i, int[] dp) {
        if (i <= 1) {
            return 1;
        }
        if (dp[i] != -1) {
            return dp[i];
        }
        dp[i] = fun(i - 1, dp) + fun(i - 2, dp);
        return dp[i];
    }

    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }
        return fun(n, dp);
    }
}
