class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0;

        for (int i = 0; i < m; i++) {
            if (matrix[i][n - 1] >= target && matrix[i][0] <= target) {
                row = i;
                break;
            }
        }

        return searchValue(matrix, row, 0, n - 1, target);
    }

    private boolean searchValue(int[][] matrix, int row, int start, int end, int target) {
        if (start > end) {
            return false;
        }

        int mid = (end - start) / 2 + start;

        if (matrix[row][mid] == target) {
            return true;
        } else if (matrix[row][mid] >= target) {
            return searchValue(matrix, row, start, mid - 1, target);
        } else {
            return searchValue(matrix, row, mid + 1, end, target);
        }
    }
}
