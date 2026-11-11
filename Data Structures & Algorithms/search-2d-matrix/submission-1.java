class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int totalRows = matrix.length;
        int totalCols = matrix[0].length;

        int n = totalRows * totalCols;
        int s = 0;
        int e = n - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            int rowIdx = mid / totalCols;
            int colIdx = mid % totalCols;

            if (matrix[rowIdx][colIdx] == target) {
                return true;
            } else if (matrix[rowIdx][colIdx] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return false;
    }
}
