package codes.MinimumDepthofBinaryTree;


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
    public int minDepth(TreeNode root) {
        if (root==null)
            return 0;
        int maxDepthLeft= minDepth(root.left);
        int maxDepthRight = minDepth(root.right);
        if (maxDepthLeft==0||maxDepthRight==0)
            return maxDepthLeft+maxDepthRight+1;
        else return Integer.min(maxDepthLeft,maxDepthRight)+1;
    }
}