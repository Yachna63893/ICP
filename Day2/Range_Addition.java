package ICP.Day2;

import java.util.Scanner;

public class Range_Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[3][3];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int[] result = Modify(n, arr);
        for(int i=0; i<n; i++){
            System.out.print(result[i]+" ");
        }
        sc.close();
    }
    public static int[] Modify(int n, int[][] arr){
        int[] ans = new int[n];
        for(int i=0; i<arr.length;  i++){
            int si = arr[i][0];
            int ei = arr[i][1];
            int val = arr[i][2];

            ans[si] = ans[si] + val;
            if(ei+1<n){
                ans[ei+1] = ans[ei+1]-val;
            }
        }
        for(int i=1; i<n; i++){
            ans[i] = ans[i] +  ans[i-1];
        }
        return ans;
    }
}
