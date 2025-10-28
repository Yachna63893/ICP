package ICP.Day10;

import java.util.*;

public class Next_Greater_I {
    class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<nums2.length; i++){
            while (!st.isEmpty() && nums2[i] > st.peek()) {
                map.put(st.pop(), nums2[i]);
            }
            st.push(nums2[i]);
        }
        while (!st.isEmpty()) {
            map.put(st.pop(), -1);
        }
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}
}
