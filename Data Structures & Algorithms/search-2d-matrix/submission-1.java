class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0;
        int bottom = m -1;
        int row = -1;

        while(top <= bottom){

            int mid = top + (bottom - top) / 2;

            if(target >= matrix[mid][0] && target <= matrix[mid][n-1]){
                row = mid;
                break;
            }
            else if (target < matrix[mid][0]){
                bottom = mid - 1;
            }
            else{
                top = mid + 1;
            }
        }

        if(row == -1) return false;

        int low = 0;
        int high = n - 1;

        while(low <= high){
            int mid = low + (high-low) /2;

            if(matrix[row][mid] == target) return true;

            else if(matrix[row][mid] < target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return false;
    }
}