package ICP.Day2;

import java.util.Scanner;

public class Find_Peak_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Peak(arr));
        sc.close();
    }
    public static int Peak(int[] arr){
        int lo = 0;
        int hi = arr.length-1;
        while(lo<hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]<arr[mid+1]){
                lo = mid+1;
            }else{
                hi = mid;
            }
            
        }
        return lo;
    }
}
