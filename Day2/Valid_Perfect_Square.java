package ICP.Day2;

import java.util.Scanner;

public class Valid_Perfect_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Square(n));
        sc.close();
    }
    public static boolean Square(int n){
        int k = 2;
        int lo = 1;
        int hi = n;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(Math.pow(mid,k)==n){
                return true;
            }else if(Math.pow(mid,k)>n){
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }
        return false;
    }
}
