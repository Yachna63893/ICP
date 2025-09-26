package ICP.Day1;

import java.util.Scanner;

public class First_And_Last_Position {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int first = FirstPosition(arr, target);
        int last = LastPosition(arr, target);
        System.out.println(first+" "+last);
        sc.close();
    }
    public static int FirstPosition(int[] arr, int target){
        int lo = 0;
        int hi = arr.length-1;
        int ans = -1;
        while(lo<=hi){
            int mid = lo + ((hi-lo)/2);
            if(arr[mid]>=target){
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
            if(arr[mid]==target){
                ans = mid;
            }
        }
        return ans;
    }
    public static int LastPosition(int[] arr, int target){
        int lo = 0;
        int hi = arr.length-1;
        int ans = -1;
        while(lo<=hi){
            int mid = lo + ((hi-lo)/2);
            if(arr[mid]<=target){
                lo = mid + 1;
            }else{
                hi = mid - 1;
            }
            if(arr[mid]==target){
                ans = mid;
            }
        }
        return ans;
    }
}
