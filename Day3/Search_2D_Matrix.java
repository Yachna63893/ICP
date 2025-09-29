package ICP.Day3;

public class Search_2D_Matrix {
    class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int lo = 0;
        int hi = m * n - 1;
        while (lo <= hi) {
            int mid = lo + (hi-lo)/2;
            int val = matrix[mid / n][mid % n];
            if (val == target) {
                return true;
            }
            else if (val < target) {
                lo = mid + 1;
            }
            else{
                hi = mid - 1;
            } 
        }
        return false;
    }
}
}
