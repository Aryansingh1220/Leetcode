class Solution {
    public String smallestGoodBase(String n) {
         long num = Long.parseLong(n);
        for (long i = 63; i >= 1; i--) {
            long low = 2, high = num - 1;
            while (low <= high) {
                long mid = low + (high - low) / 2;
                long val = 0;
                long x = 1;
                for (long j = 1; j <= i; j++) {
                    val += x;
                    if (val >= num) break;
                    if (j < i && (num - val) / x < mid) {
                        val = Long.MAX_VALUE;
                        break;
                    }
                    if (j < i) x *= mid;
                }
                if (val > num) {
                    high = mid - 1;
                } else if (val < num) {
                    low = mid + 1;
                } else {
                    return String.valueOf(mid);
                }
            }
        }
        return "";
    }
}