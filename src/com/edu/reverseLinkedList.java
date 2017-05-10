package com.edu;

/**
 * Created by RHAJELA on 5/9/2017.
 */
public class reverseLinkedList {

    public ListNode reverseList(ListNode head) {

        /** recursive **/

        if(head == null && head.next == null) return head;
        ListNode nextNode = head.next;
        ListNode newHead = reverseList(nextNode);
        nextNode.next = head;
        head.next = null;
        return newHead;



        /* First Iterative solution

        if(head == null || head.next == null) return head;
        ListNode first = head;
        ListNode second = head.next;

        while(second.next != null) {
            ListNode temp = second.next;
            second.next = first;
            first = second;
            second = temp;
        }
        second.next = first;
        head.next = null;
        return second;*/
    }
}
