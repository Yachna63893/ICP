package ICP.Day1;

import java.util.*;

public class Koko_Eating_Bananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int h = sc.nextInt();
        System.out.println(Search(arr, h));
        sc.close();
    }
    public static int Search(int[] arr, int h){
        int last = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            last = Math.max(last, arr[i]);
        }
        int lo = 1;
        int hi = last;
        int ans = 0;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            int hours = maxhour(arr, mid);
            if(hours<=h){
                ans = mid;
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }
        return ans;
    }
    public static int maxhour(int[] arr, int mid){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            double ans = Math.ceil( arr[i]/ (double) mid);
            sum += ans;
        }
        return sum;
    }
}
