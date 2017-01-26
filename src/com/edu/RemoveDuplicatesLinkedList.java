package com.edu;

/**
 * Created by RHAJELA on 8/22/2016.
 */
public class RemoveDuplicatesLinkedList {

    public ListNode deleteDuplicates(ListNode head) {
        if(head  == null || head.next == null) {
            return head;
        }
        ListNode start = head;
        ListNode second = start.next;
        while(start.next != null && second != null) {

            if (start.val != second.val) {
                start.next = second;
                start= start.next;
                second = second.next;
            }else {
            second = second.next; }

        }
        start.next = second;

        return head;
    }
}
