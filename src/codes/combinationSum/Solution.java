package codes.combinationSum;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> res;
    public int target;

    Solution() {
        this.res = new ArrayList<>();
    }

    public void dfs(int i, int[] candidates, List<Integer> cur, int total) {
        if (total == this.target) {
            res.add(new ArrayList<>(cur));
            return;
        }
        if (i >= candidates.length || total > target)
            return;
        cur.add(candidates[i]);
        dfs(i, candidates, cur, total + candidates[i]);
        cur.remove(cur.size() - 1);
        dfs(i + 1, candidates, cur, total);

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.target = target;
        dfs(0, candidates, new ArrayList<>(), 0);
        return res;

    }

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        Solution solution = new Solution();
        System.out.println("Result: " + solution.combinationSum(candidates, target));
    }
}


