package KthSmallestElement;


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
    /*public int totalNodes(TreeNode root) {
        if (root == null) return 0;
        return 1 + totalNodes(root.left) + totalNodes(root.right);
    }

    public int kthSmallest(TreeNode root, int k) {
        int count = totalNodes(root.left);
        if (k <= count) return kthSmallest(root.left, k);
        else if (k > count + 1) return kthSmallest(root.right, k - 1 - count);
        return root.val;
    }*/
   /* public static int number;
    public static int count;

    public int kthSmallest(TreeNode root, int k) {
        int count = k;
        helper(root);
        return number;
    }

    public void helper(TreeNode root) {
        if (root.left != null) helper(root.left);
        count--;
        if (count == 0) {
            number = root.val;
            return;
        }
        if (root.right != null)  helper(root.right);
    }*/

    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> st = new Stack<>();
        while (root!=null){
            st.push(root);
            root=root.left;
        }
        while (k!=0){
            TreeNode n = st.pop();
            k--;
            if (k==0) return n.val;
            TreeNode right= n.right;
            while (right!=null){
                st.push(right);
                right=right.left;
            }
        }
        return -1;
    }
}
