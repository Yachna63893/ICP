package ICP.Day1;
import java.util.*;

public class Find_Town_Judge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][2];
        for (int i = 0; i < m; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        System.out.println(Judge(n,arr));
        sc.close();

    }
    public static int Judge(int n,int[][] arr){
        int[] count = new int[n+1];
        for(int i=0; i<arr.length; i++){
            int a = arr[i][0];
            int b = arr[i][1];
            count[a]--;
            count[b]++;
        }
        for(int i=1; i<=n; i++){
            if(count[i]==n-1){
                return i;
            }
        }
        return -1;
    }
}
