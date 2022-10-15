package codes.populating_next_right_pointer_in_each_node;

import java.util.LinkedList;
import java.util.Queue;

// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};

class Solution {
    /*public Node connect(Node root) {
        if (root != null)
            root.next = null;
        if (root != null && root.right != null)
            dfs(root.left, root, 'r');
        if (root != null && root.left != null)
            dfs(root.left, root, 'l');
        return root;

    }

    public void dfs(Node c, Node p, char r) {
        if (c != null) {
            if (r == 'l') {
                c.next = p.right;
            }
            while (c.next == null && p.next != null) {
                c.next = p.next.left;
                if (c.next == null) c.next = p.next.right;
                p = p.next;
            }
            if (c.right != null)
                dfs(c.right, c, 'r');
            if (c.left != null)
                dfs(c.left, c, 'l');

        }
    }*/


    public Node connect(Node root) {
        if (root == null)
            return root;
        Queue<Node> q = new LinkedList<>();
        Node temp1 = root;
        q.add(temp1);
        while (!q.isEmpty()){
            int size = q.size();
            for (int i =0; i< size;i++){
                Node temp = q.poll();
                if (i==size-1)
                    temp.next = null;
                else temp.next = q.peek();

                if (temp.left!=null)
                    q.add(temp.left);
                if (temp.right!=null)
                    q.add(temp.right);
            }
        }
        return root;
    }
}