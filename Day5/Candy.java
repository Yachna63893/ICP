package ICP.Day5;

public class Candy {
    class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] count = new int[n];
        count[0] = 1;
        for(int i=1; i<n; i++){
            if(ratings[i]>ratings[i-1]){
                count[i] = count[i-1]+1;
            }else{
                count[i] = 1;
            }
        }
        int[] count1 = new int[n];
        count1[n-1] = 1;
        for(int j=n-2; j>=0; j--){
            if(ratings[j]>ratings[j+1]){
                count1[j] = count1[j+1]+1;
            }else{
                count1[j] = 1;
            }
        }
        int res = 0;
        for(int k=0; k<n; k++){
            res = res + Math.max(count[k],count1[k]);
        }
        return res;
    }
}
}
