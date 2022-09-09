package Binary_Tree_Right_Side_View;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list =new ArrayList<>();
        if (root == null)
            return list;
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode temp1 = root;
        q.add(temp1);
        while (!q.isEmpty()){
            int size = q.size();
            for (int i =0; i< size;i++){
                TreeNode temp = q.poll();
                if (i==size-1)
                    list.add(temp.val);
                if (temp.left!=null)
                    q.add(temp.left);
                if (temp.right!=null)
                    q.add(temp.right);
            }
        }
        return list;
    }
    /*int maxLevel = -1;
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> rightView = new ArrayList<>();
        // Root node will be at level 0
        dfs(root, 0, rightView);
        return rightView;
    }

    public void dfs(TreeNode root, int currLevel, List<Integer> rightView) {
        if (root == null) return;
        // process root node - only print this node if its level is more than the level of the previously printed nodes
        if (currLevel > maxLevel) {
            rightView.add(root.val);
            maxLevel++;
        }
        // DFS on right
        dfs(root.right, currLevel + 1, rightView);
        // DFS on left
        dfs(root.left, currLevel + 1, rightView);
    }*/
}