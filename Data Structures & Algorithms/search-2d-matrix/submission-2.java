class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start = 0;
        int n = matrix[0].length;
        int end = matrix.length * n - 1;

        while(start <= end){
            int mid = (end - start) / 2 + start;

            int row = mid / n;
            int col = mid % n;

            if(matrix[row][col] == target){
                return true;
            } else if(matrix[row][col] < target){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
        
    }
}
