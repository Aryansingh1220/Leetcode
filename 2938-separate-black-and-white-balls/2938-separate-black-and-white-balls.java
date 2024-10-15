class Solution {
    public long minimumSteps(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        int zerosToLeft = 0;
        int swaps = 0;

       
        for (int i = 0; i < n; i++) {
            if (arr[i] == '0') {
                swaps += zerosToLeft;  // Count the number of zeros before this '1'
            } else {
                zerosToLeft++;  // Increment count of zeros
            }
        }

        return swaps;
    }
}
