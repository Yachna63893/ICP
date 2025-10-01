package ICP.Day5;

public class Lemonade_Change {
    class Solution {
    public boolean lemonadeChange(int[] bills) {
        return Lemonade(bills);
    }
    public static boolean Lemonade(int[] bills){
        int five = 0;
        int ten = 0;
        for(int i=0; i<bills.length; i++){
            int bill = bills[i];
            if(bill == 5){
                five++;
            }else if(bill == 10){
                if(five==0){
                    return false;
                }
                five--;
                ten++;
            }else{
                if(ten>0 && five>0){
                    ten--;
                    five--;
                }else if(five>=3){
                    five = five - 3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
}
