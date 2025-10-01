package ICP.Day5;

import java.util.Arrays;

public class Minimum_Number_Arrows {
    class Solution {
    public int findMinArrowShots(int[][] points) {
        return Minarrow(points);
    }
    public static int Minarrow(int[][] arr){
        if(arr.length==0){
            return 0;
        }
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        int aro = 1;
        int ps = arr[0][0];
        int pe = arr[0][1];
        for(int i=1;i<arr.length; i++){
            int cs = arr[i][0];
            int ce = arr[i][1];
            if(cs>pe){ //No overlap
                aro++;
                ps = cs;
                pe = ce;
            }else{ //Overlp
                ps = Math.max(ps,cs);
                pe = Math.min(pe, ce);
            }
        }
        return aro;
    }
}
}
