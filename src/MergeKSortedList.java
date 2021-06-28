import java.util.*;

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

public class MergeKSortedList {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode(0);
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (ListNode l :lists) {
            while (l != null) {
                pq.add(l.val);
                l = l.next;
            }

        }
        ListNode node = head;
        while (!pq.isEmpty()) {
            node.next = new ListNode((int) pq.remove());
            node = node.next;
        }
        return head.next;
    }
}
