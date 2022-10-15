package codes;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class reverserNode {
    public ListNode reverseKGroup(ListNode head, int k) {
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            temp=temp.next;
            length++;
        }
        int l = 0;
        int r = k - 1;
        while (r < length) {
            reverseGroup(l, r, head);
            l = r + 1;
            r += k;
        }
        return head;
    }

    public void reverseGroup(int l, int r, ListNode head) {
        while (l < r) {
            ListNode temp1 = getNode(l, head);
            ListNode temp2 = getNode(r, head);
            int dataVal = temp1.val;
            temp1.val = temp2.val;
            temp2.val = dataVal;
            l++;
            r--;
        }
    }

    public ListNode getNode(int n, ListNode head) {
        ListNode temp = head;
        while (n > 0) {
            temp = temp.next;
            n--;
        }
        return temp;
    }


    public ListNode swapNodes(ListNode head, int k) {
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            temp=temp.next;
            length++;
        }
        ListNode temp1 = getNode(k-1, head);
        ListNode temp2 = getNode(length-k, head);
        int dataVal = temp1.val;
        temp1.val = temp2.val;
        temp2.val = dataVal;
        return head;
    }

    public static void main(String[] args) {

    }
}