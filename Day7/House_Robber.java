package ICP.Day7;

public class House_Robber {
    class Solution {
    public int rob(int[] arr) {
        int pre = 0;
        int curr = 0;
        for(int i=0; i<arr.length; i++){
            int num = arr[i];
            int temp = curr;
            curr = Math.max(curr, pre+num);
            pre = temp;
        }
        return curr;
    }
}
}
