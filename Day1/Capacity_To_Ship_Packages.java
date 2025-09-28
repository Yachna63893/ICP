package ICP.Day1;

import java.util.*;

public class Capacity_To_Ship_Packages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int days = sc.nextInt();
        System.out.println(Ship(arr, days));
        sc.close();
    }
    public static int Ship(int[] arr, int days){
        int first = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            first = Math.max(arr[i], first);
        }
        int lo = first;

        int last = 0;
        for(int i=0; i<arr.length; i++){
            last+=arr[i];
        }
        int hi = last;
        int ans = 0;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            int dy = canship(arr,mid);
            if(dy<=days){
                ans = mid;
                hi = mid-1;
            }else{
                lo = mid + 1;
            }
        }
        return ans;
    }
    public static int canship(int[] arr, int mid){
        int d = 1;
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(sum>mid){
                sum = arr[i];
                d++;
            }
        }
        return d;
    }
}