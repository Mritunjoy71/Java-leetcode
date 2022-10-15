package codes.AverageofLevelsinBinaryTree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
    /*public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new LinkedList<>();
        if (root == null) return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            double sum=0;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                sum+=node.val;
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            list.add(sum/size);
        }
        return list;
    }*/

    class Node {
        double sum;
        int count;

        Node(double sum, int count) {
            this.sum = sum;
            this.count = count;
        }
    }

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new LinkedList();
        if (root == null) return list;
        List<Node> temp = new ArrayList<>();
        levelMaker(temp, root, 0);
        for (int i=0;i< temp.size();i++){
            list.add(temp.get(i).sum/temp.get(i).count);
        }
        return list;
    }

    public void levelMaker(List<Node> temp, TreeNode root, int level) {
        if (root == null) return;
        if (level >= temp.size()){
            Node newNode = new Node(root.val, 1);
            temp.add(newNode);
        }else
        {
            temp.get(level).sum+= root.val;
            temp.get(level).count++;
        }
        levelMaker(temp, root.left, level + 1);
        levelMaker(temp, root.right, level + 1);
    }
}