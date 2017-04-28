package com.edu;

/**
 * Created by RHAJELA on 4/28/2017.
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy  = new ListNode(0);
        ListNode p = l1;
        ListNode q = l2;
        ListNode curr = dummy;
        int carry = 0;
        int x = 0;
        int y = 0;
        int sum = 0;

        while(p != null || q != null) {
            x = (p != null) ? p.val : 0;
            y = (q != null) ? q.val : 0;

        }

        return dummy.next;
    }
}
