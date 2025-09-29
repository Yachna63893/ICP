package ICP.Day3;

public class Matrix_Diagonal_Sum {
    class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int row = mat.length;;
        int col = mat[0].length;
        int sum = 0;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(i==j || i+j==n-1){
                    sum = sum+mat[i][j];
                }
            }
        }
        return sum;
    }
}
}
