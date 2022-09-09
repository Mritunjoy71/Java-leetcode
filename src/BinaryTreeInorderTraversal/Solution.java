package BinaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;

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
    public  static List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root==null)
            return list;
        helper(root);
        return list;
    }
    public void helper(TreeNode root){
        if (root==null)
            return;
        helper(root.left);
        list.add(root.val);
        helper(root.right);
    }

}