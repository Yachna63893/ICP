package ICP.Day6;

import java.util.*;

public class Combination_Sum_II {
    class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }
    public static void dfs(int[] candidates, int target, int start, List<Integer> path, List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int i=start; i<candidates.length && candidates[i]<=target; i++){
            if(i>start && candidates[i]==candidates[i-1]){
                continue;
            }
            path.add(candidates[i]);
            dfs(candidates, target-candidates[i], i+1, path, ans);
            path.remove(path.size()-1);
        }
    }
}
}
