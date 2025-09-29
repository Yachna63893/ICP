package ICP.Day3;

public class Rotate_Image {
    class Solution {
    public void rotate(int[][] arr) {
        Rotate(arr);
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
    public static int[][] Transpose(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        return arr;
    }
    public static int[][] Rotate(int[][] arr){
        Transpose(arr);
        int n = arr.length;
        int col = arr[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<col/2; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][col-j-1];
                arr[i][col-j-1] = temp;
            }
        }
        return arr;
    }
}
}
