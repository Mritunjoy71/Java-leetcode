package FindDuplicateSubtrees;

import jdk.internal.org.objectweb.asm.Handle;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> answer = new LinkedList<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        dfs(root,answer,hashMap);
        return answer;
    }

    public String dfs(TreeNode root, List<TreeNode> answer, HashMap<String, Integer> hashMap) {
        if (root == null) return "#";
        String subTree = root.val + "," + dfs(root.left, answer, hashMap) + "," + dfs(root.right, answer, hashMap);
        hashMap.put(subTree, hashMap.getOrDefault(subTree,0)+1);
        if (hashMap.get(subTree)==2)
            answer.add(root);
        return subTree;
    }
}


