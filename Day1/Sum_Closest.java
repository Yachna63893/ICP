package ICP.Day1;
import java.util.*;
public class Sum_Closest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(Sum(arr, target));
        sc.close();
    }
    public static int Sum(int[] arr, int target){
        int n = arr.length;
        int closestSum = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int k=0; k<=n-3; k++){
            int i = k+1;
            int j = n-1;
            while(i<j){
                int sum = arr[k] + arr[i] + arr[j];
                if(Math.abs(target-sum)<Math.abs(target-closestSum)){
                    closestSum = sum;
                }
                if(sum<target){
                    i++;
                }else{
                    j--;
                }
            }
        }

        return closestSum;
    }
}
