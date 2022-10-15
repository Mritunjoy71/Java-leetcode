package codes.BinaryTreeLevelOrderTraversal_II;


import java.util.*;

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
   /* public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> tempList = new ArrayList<>();
            int size = queue.size();
            for (TreeNode treeNode : queue) {
                tempList.add(treeNode.val);
            }

            list.add(0,tempList);
            for (int i = 0; i <size;i++){
                TreeNode node= queue.poll();
                if (node.left!=null) queue.add(node.left);
                if (node.right!=null) queue.add(node.right);
            }
        }
        return list;
    } */

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) return list;
        levelMaker(list,root,0);
        return list;
    }
    public void levelMaker(List<List<Integer>> list,TreeNode root, int level){
        if (root==null) return;
        if (level>= list.size())
            list.add(0,new LinkedList<Integer>());
        levelMaker(list,root.left,level+1);
        levelMaker(list,root.right,level+1);
        list.get(list.size()-level-1).add(root.val);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left= new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> list = new Solution().levelOrderBottom(root);

    }
}