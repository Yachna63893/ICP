package ICP.Day2;

import java.util.*;

public class Arranging_Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Rows(n));
        sc.close();
    }
    public static int Rows(int n){
        int lo = 1;
        int hi = n;
        int ans = 0;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            long sum = (long) mid * (mid+1)/2;
            if(sum<=n){
                ans = mid;
                lo = mid + 1;
            }else{
                hi = mid - 1;
            }
        }
        return ans;
    }
}
