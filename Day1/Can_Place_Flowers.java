package ICP.Day1;

import java.util.Scanner;

public class Can_Place_Flowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(Place(arr, target));
        sc.close();
    }
    public static boolean Place(int[] arr, int target){
        if(target==0){
            return true;
        }
        int left = target;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0 && Righempty(arr, i) && Leftempty(arr, i)){
                arr[i] = 1;
                left--;
                if(left==0){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean Righempty(int[] arr, int i){
        if(i==arr.length-1 || arr[i+1]==0){
            return true;
        }else{
            return false;
        }
    }
    public static boolean Leftempty(int[] arr, int i){
        if(i==0 || arr[i-1]==0){
            return true;
        }else{
            return false;
        }
    }
}
