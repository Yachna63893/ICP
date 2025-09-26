package ICP.Day1;

import java.util.Scanner;

public class Running_Sum_1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int[] result = Sum(arr);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
        sc.close();
    }
    public static int[] Sum(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        ans[0] = arr[0];
        for(int i=1; i<n; i++){
            ans[i] = ans[i-1] + arr[i];
        }
        return ans;
    }
}
