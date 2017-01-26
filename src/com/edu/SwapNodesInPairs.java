package com.edu;

/**
 * Created by RHAJELA on 8/2/2016.
 */
public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        ListNode start = head;
        ListNode current = start;

while (current != null && current.next != null) {
    ListNode first = current;
    ListNode second = current.next;

    first.next = second.next;
    current = second;
    current.next = first;
    current = current.next;
}

        return start;

    }

}
