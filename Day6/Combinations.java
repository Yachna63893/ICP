package ICP.Day6;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    class Solution {
    public List<List<Integer>> combine(int n, int k) {
       List<List<Integer>> ans = new ArrayList<>();
       dfs(1, n, k, new ArrayList<>(), ans);
       return ans; 
    }
    public static void dfs(int start, int n, int k, List<Integer> path, List<List<Integer>> ans){
        if(path.size()==k){
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int i=start; i<=n; i++){
            path.add(i);
            dfs(i+1, n, k, path, ans);
            path.remove(path.size()-1);
        }

    }
}
}
