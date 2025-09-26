package ICP.Day1;

import java.util.Scanner;


public class Maximum_Sum_Circular_Subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Max(arr));
        sc.close();
    }
    public static int Kadanes(int[] arr){
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
            ans = Math.max(ans, sum);
            if(sum<0){
                sum = 0;
            }
        }
        return ans;
    }
    public static int Max(int[] arr){
        int linear = Kadanes(arr);
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
            arr[i] = arr[i] * -1;
        }
        int max = Kadanes(arr);
        int cir = max + sum;
        if(cir==0){
            return linear;
        }
        return Math.max(linear, cir);
    }
}