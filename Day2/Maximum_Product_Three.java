package ICP.Day2;

import java.util.*;

public class Maximum_Product_Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(MaxPro(arr));
        sc.close();
    }
    public static int MaxPro(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        int max1 = arr[n-1]*arr[n-2]*arr[n-3];
        int max2 = arr[0]*arr[1]*arr[n-1];
         
        int ans = Math.max(max1, max2);
        return ans;
    }
}
