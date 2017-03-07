package com.edu;

/**
 * Created by Rachita on 3/3/2017.
 */
public class RemoveLLElement {
    public ListNode removeElements(ListNode head, int val) {

        ListNode curr = head;
        ListNode prev = head;

        while (curr != null) {
            if (curr.val == val) {
                if (curr == head) { //or find the head where curr.val != val and then go into while/
                    head = curr.next;
                    curr = head;
                    prev = head;
                } else {
                    prev.next = curr.next;
                    curr = curr.next;
                }
            } else {
                prev = curr;
                curr = curr.next;
            }
        }

        return head;
    }
}
