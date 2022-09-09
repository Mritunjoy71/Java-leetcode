package FindModeinBinarySearchTree;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    /*public int[] findMode(TreeNode root) {
        if (root == null) return new int[0];
        Stack<TreeNode> stack = new Stack<>();
        Map<Integer,Integer> frequency = new HashMap<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            frequency.put(root.val,frequency.get(root.val)==null? 1:frequency.get(root.val)+1);
            root = root.right;
        }

        List<Integer> mode = new ArrayList<>();
        int maxCount =Collections.max( frequency.values());
        for (int val: frequency.keySet()) {
            if (frequency.get(val)==maxCount)
                mode.add(val);
        }
        int[] res = new int[mode.size()];
        for (int i = 0;i<mode.size();i++)
            res[i]=mode.get(i);
        return res;
    }*/

    private int maxCount =0;
    private int currCount=0;
    private TreeNode prev = null;
    List<Integer> mode = new ArrayList<>();
    public void inorder(TreeNode root, boolean getList){
        if (root==null) return;
        inorder(root.left,getList);
        if (prev!=null && root.val== prev.val)
            currCount++;
        else currCount=1;
        if (!getList) maxCount = Math.max(currCount,maxCount);
        else if (currCount==maxCount) mode.add(root.val);
        prev = root;
        inorder(root.right,getList);
    }
    public int[] findMode(TreeNode root) {
        if (root==null) return mode.stream().mapToInt(i->i).toArray();
        inorder(root,false);
        prev =null;
        currCount=0;
        inorder(root,true);
        return mode.stream().mapToInt(i->i).toArray();
    }
}