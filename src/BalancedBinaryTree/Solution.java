package BalancedBinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
    boolean isBalanced(TreeNode root) {
        if (root==null) return true;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre =null;
        stack.push(root);
        while (root!=null && !stack.isEmpty()){
            while (root!=null){
                stack.push(root);
                root=root.left;
            }
            root = stack.pop();
            root = root.right;
        }

        return true;
    }
}