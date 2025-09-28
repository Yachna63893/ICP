package ICP.Day1;

import java.util.*;

public class Minimum_Time_Complete_Trips {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        System.out.println(Time(arr, t));
        sc.close();
    }
    public static long Time(int[] arr, int t){
        long lo = 1;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            min = Math.min(min, arr[i]);
        }
        long hi = (long) min*t;
        long ans = 0;
        while (lo<=hi) {
            long mid = lo + (hi-lo)/2;
            if(possibletrips(arr,mid)>=t){
                ans = mid;
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }
        return ans;
    }
    public static long possibletrips(int[] arr, long mid){
        long ans = 0;
        for(int i=0; i<arr.length; i++){
            ans += mid/arr[i];
        }
        return ans;
    }
}