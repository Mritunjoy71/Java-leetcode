package codes.SecondMinimumNodeInaBinaryTree;


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
    public int findSecondMinimumValue(TreeNode root) {
        /*if (root == null || root.left == null || root.right == null) return -1;
        Queue<TreeNode> q = new LinkedList<>();
        Integer secMin = null;
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            if (node.right != null) q.offer(node.right);
            if (node.left != null) q.offer(node.left);
            if (node.val != root.val) {
                if (secMin != null)
                    secMin = Integer.min(secMin, node.val);
                else secMin = node.val;
            }
        }
        return secMin == null ? -1 : secMin;*/
        if (root.left == null) return -1;
        int l = root.left.val == root.val ? findSecondMinimumValue(root.left) : root.left.val;
        int r = root.right.val == root.val ? findSecondMinimumValue(root.right) : root.right.val;

        return r == -1 || l==-1 ? Integer.max(l,r) : Integer.min(l,r);

    }
}