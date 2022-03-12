package BalancedBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

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
    /*public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        *//*int leftH = 0,rightH=0;
        if (root.left!=null)
            leftH=height(root.left);
        if (root.right!=null)
            rightH = height(root.right);
        if (Math.abs(rightH-leftH)>1)
            return false;
        return true;*//*
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = q.poll();
                int leftH = 0, rightH = 0;
                assert temp != null;
                if (temp.left != null)
                    leftH = height(temp.left);
                if (temp.right != null)
                    rightH = height(temp.right);
                if (Math.abs(rightH - leftH) > 1)
                    return false;
                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);
            }
        }
        return true;
    }

    public int height(TreeNode root) {
        if (root == null)
            return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Integer.max(leftHeight, rightHeight) + 1;
    }*/



    public int dfsHeight (TreeNode root) {
        if (root == null) return 0;

        int leftHeight = dfsHeight (root.left);
        if (leftHeight == -1) return -1;
        int rightHeight = dfsHeight (root.right);
        if (rightHeight == -1) return -1;

        if (Math.abs(leftHeight - rightHeight) > 1)  return -1;
        return Integer.max(leftHeight, rightHeight) + 1;
    }
    boolean isBalanced(TreeNode root) {
        return dfsHeight (root) != -1;
    }
}