package ICP.Day4;

import java.util.*;

public class Permutation_In_String {
    class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if(n>m){
            return false;
        }
        char[] arr = s1.toCharArray();
        Arrays.sort(arr);
        String sorted = new String(arr);

        for(int i=0; i<=m-n; i++){
            String substring = s2.substring(i,i+n);
            char[] arr1 = substring.toCharArray();
            Arrays.sort(arr1);
            String sorted1 = new String(arr1);
            if(sorted.equals(sorted1)){
                return true;
            }
        }
        return false;
    }
}
}
