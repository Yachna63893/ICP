// package Leetcode;

// import java.util.Scanner;

// public class Array_From_Permutation {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i=0; i<arr.length; i++){
//             arr[i] = sc.nextInt();
//         }
//         Create(arr);
//         sc.close();
//     }
//     public static void Create(int[] arr){
//         int n = arr.length;
//         int[] ans = new int[n];
//         for(int i=0; i<arr.length; i++){
//             ans[i] = arr[arr[i]];
//         }
//         for(int i=0; i<arr.length; i++){
//             System.out.print(ans[i]+" ");
//         }
//     }
// }




package ICP.Day1;

import java.util.Scanner;

public class Array_From_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int[] result = Create(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(result[i]+" ");
        }
        
        sc.close();
    }
    public static int[] Create(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        for(int i=0; i<arr.length; i++){
            ans[i] = arr[arr[i]];
        }
        return ans;
    }
}