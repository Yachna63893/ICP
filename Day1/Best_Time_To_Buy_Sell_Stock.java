package ICP.Day1;

import java.util.Scanner;

public class Best_Time_To_Buy_Sell_Stock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Profit(arr));
        sc.close();
    }
    public static int Profit(int[] arr){
        int min = Integer.MAX_VALUE;
        int maxs = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
            else{
                maxs = Math.max(arr[i]-min,maxs);
            }
        }
        return maxs;
    }
}
