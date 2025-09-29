package ICP.Day3;
import java.util.*;

public class Spiral_Matrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> spiral = Print(arr);
        System.out.println(spiral);

    }
    public static List<Integer> Print(int[][] arr){
        List<Integer> result = new ArrayList<>();
        int minr = 0;
        int minc = 0;
        int maxr = arr.length-1;
        int maxc = arr[0].length-1;
        int te = arr.length*arr[0].length;
        int c = 0;
        while(c<te){
            for(int i=minc; i<=maxc && c<te; i++){
                result.add(arr[minr][i]);
                c++;
            }
            minr++;
            for(int i=minr; i<=maxr && c<te; i++){
                result.add(arr[i][maxc]);
                c++;
            }
            maxc--;
            for(int i=maxc; i>=minc && c<te; i--){
                result.add(arr[maxr][i]);
                c++;
            }
            maxr--;
            for(int i=maxr; i>=minr && c<te; i--){
                result.add(arr[i][minc]);
                c++;
            }
            minc++;
        }
        return result;
    }
}
