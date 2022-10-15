package codes;

import java.util.*;

class ListNode1 {
    int val;
    ListNode1 next;

    ListNode1() {
    }

    ListNode1(int val) {
        this.val = val;
    }

    ListNode1(int val, ListNode1 next) {
        this.val = val;
        this.next = next;
    }
}

public class MergeKSortedList {
    public ListNode1 mergeKLists(ListNode1[] lists) {
        ListNode1 head = new ListNode1(0);
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (ListNode1 l :lists) {
            while (l != null) {
                pq.add(l.val);
                l = l.next;
            }

        }
        ListNode1 node = head;
        while (!pq.isEmpty()) {
            node.next = new ListNode1((int) pq.remove());
            node = node.next;
        }
        return head.next;
    }
}
