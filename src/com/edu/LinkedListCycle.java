package com.edu;

/**
 * Created by RHAJELA on 3/14/2017.
 */
public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        /*ListNode slow = head;
        ListNode fast = head;

        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }

        return false;*/

        ListNode slow = head;
        ListNode fast = head.next;
        try {
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next.next;

            }
        }
        catch(NullPointerException exp){
            return false;

        }
        return true;


    }
}
