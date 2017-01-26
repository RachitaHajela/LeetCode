package com.edu;

import java.util.List;

/**
 * Created by RHAJELA on 7/28/2016.
 * Remove Nth node from the end of the list.
 */
public class RemoveNthNode {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = head;
        ListNode header = head;
        ListNode progresser = head;
        ListNode temp = head;

        for (int i = 0; i < n - 1; i++) {
            header = header.next;
        }

        while (header.next != null) {
            header = header.next;
            temp = progresser;
            progresser = progresser.next;
        }
        if (progresser.equals(head)) {
            head = head.next;
            return head;
        }

        temp.next = progresser.next;
        return head;
    }
}
