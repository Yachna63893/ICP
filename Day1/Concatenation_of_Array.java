package ICP.Day1;

import java.util.Scanner;

public class Concatenation_of_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int[] result = Concatenate(arr);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
        sc.close();
    }
    public static int[] Concatenate(int[] arr){
        int n = arr.length;
        int[] ans = new int[2*n];
        for(int i=0; i<n; i++){
            ans[i] = arr[i];
            ans[i+n] = arr[i];
        }
        return ans;
    }
}
