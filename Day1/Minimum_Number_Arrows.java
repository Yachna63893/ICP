package ICP.Day1;

import java.util.*;

public class Minimum_Number_Arrows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i=0; i<n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        System.out.println(Minarrow(arr));
        sc.close();
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
            }else{//Over
                ps = Math.max(ps,cs);
                pe = Math.min(pe, ce);
            }
        }
        return aro;
    }
}
