package codes.CousinsinBinaryTree;

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
    public int getDepth(TreeNode root, int x) {
        if (root==null) return 0;
        if (root.val == x) return 1;
        int leftResult = getDepth(root.left, x);
        if (leftResult!=0 ) return 1+leftResult;
        int rightResult = getDepth(root.right,x);
        if (rightResult!=0) return 1+ rightResult;
        return 0;
    }

    public TreeNode getParent(TreeNode root, int child) {
        if (root==null) return null;
        if (root.left != null && root.left.val == child) return root;
        else if (root.right != null && root.right.val == child) return root;
        TreeNode leftRes = getParent(root.left, child);
        TreeNode rightRes = getParent(root.right, child);
        if (leftRes !=null)
            return leftRes;
        else return rightRes;
    }

  /*  public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) return false;
        int xDepth = getDepth(root, x);
        System.out.println("x depth: " + xDepth);
        int yDepth = getDepth(root, y);
        System.out.println("y depth: " + yDepth);
        if (xDepth != yDepth) return false;
        TreeNode xParent = getParent(root, x);
        //System.out.println("X parent:" + xParent.val);
        TreeNode yParent = getParent(root, y);
        //System.out.println("Y parent:" + yParent.val);
        return xParent != yParent;
    }*/

    public boolean isCousins(TreeNode root, int A, int B) {
        if (root == null) return false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean isAexist = false;
            boolean isBexist = false;
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                assert cur != null;
                if (cur.val == A) isAexist = true;
                if (cur.val == B) isBexist = true;
                if (cur.left != null && cur.right != null) {
                    if (cur.left.val == A && cur.right.val == B) {
                        return false;
                    }
                    if (cur.left.val == B && cur.right.val == A) {
                        return false;
                    }
                }
                if (cur.left != null) {
                    queue.offer(cur.left);
                }
                if (cur.right != null) {
                    queue.offer(cur.right);
                }
            }
            if (isAexist && isBexist)  return true;
        }
        return false;
    }

    public static void main(String[] args) {
        TreeNode root= new TreeNode(1);
        root.left= new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right= new TreeNode(3);
        root.right.right = new TreeNode(5);
        boolean isCousin = new Solution().isCousins(root,5,4);
        System.out.println(isCousin);
    }
}
