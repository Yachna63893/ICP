package ICP.Day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_All_Anagrams_String {
    class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] pc = new int[26];
        int[] cs = new int[26];
        List<Integer> result = new ArrayList<>();

        for(char c : p.toCharArray()){
            pc[c - 'a']++;
        }

        for(int i=0; i<s.length(); i++){
            cs[s.charAt(i)-'a']++;
            if(i>=p.length()){
                cs[s.charAt(i-p.length())-'a']--;
            }
            if(Arrays.equals(pc,cs)){
                result.add(i-p.length()+1);
            }
        }
        return result;
    } 
}
}
