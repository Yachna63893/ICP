package ICP.Day5;

import java.util.Arrays;

public class Non_Overlapping_Intervals {
    class Solution {
    public int eraseOverlapIntervals(int[][] arr) {
       if (arr.length == 0){
        return 0;
       } 
       Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));
        
        int count = 0;
        int p = arr[0][1];      
        for (int i = 1; i < arr.length; i++) {
            if (arr[i][0] < p) {
                count++;
            } else {
                p = arr[i][1];
            }
        }
        
        return count;
    } 
}
}
