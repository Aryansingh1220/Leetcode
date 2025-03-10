class Solution {
    private boolean matches(int[][] matrix, int[][] target) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != target[i][j]) return false;
            }
        }
        return true;
    }
    private void rotate90(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
    public boolean findRotation(int[][] matrix, int[][] target) {
         int n = matrix.length;

        for (int r = 0; r < 4; r++) {
            if (matches(matrix, target)) return true;
            rotate90(matrix);
        }
        return false;
    }
}