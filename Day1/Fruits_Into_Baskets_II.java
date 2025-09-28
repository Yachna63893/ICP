package ICP.Day1;

import java.util.Scanner;

public class Fruits_Into_Baskets_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] fruits = new int[n];
        for(int i=0; i<fruits.length; i++){
            fruits[i] = sc.nextInt();
        }
        int[] bask = new int[n];
        for(int i=0; i<fruits.length; i++){
            bask[i] = sc.nextInt();
        }
        System.out.println(Unplaced(fruits, bask));
        sc.close();
    }
    public static int Unplaced(int[] fruits, int[] bask){
        int unp = 0;
        for(int i=0; i<fruits.length; i++){
            boolean x = false;
            for(int j=0; j<bask.length; j++){
                
                if(bask[j]>=fruits[i]){
                    bask[j]=-1;
                    x = true;
                    break;
                }
            }
            if(x == false){
                unp++;
            }
        }
        return unp;
    }
}