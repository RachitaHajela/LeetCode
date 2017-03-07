package com.edu;

import java.util.Stack;

/**
 * Created by Rachita on 3/4/2017.
 */
public class PalindromeLL {

    public static boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode curr = head;
        ListNode twoStep = head;
        int count = 1;
        while (curr.next != null) {
            count++;
            curr = curr.next;
        }
        curr = head;

        while (twoStep != null && twoStep.next != null) {
            stack.add(curr.val);
            curr = curr.next;
            twoStep = twoStep.next.next;
        }

        if (count % 2 == 0) {
            while (curr != null) {
                if (curr.val != stack.pop()) {
                    return false;
                }
                curr = curr.next;
            }
        } else {
            curr = curr.next;
            while (curr != null) {
                if (curr.val != stack.pop()) {
                    return false;
                }
                curr = curr.next;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        /*ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(7);
        ListNode l5 = new ListNode(3);
        ListNode l6 = new ListNode(2);
        ListNode l7 = new ListNode(1);*/
        l1.next = l2;
        /*l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;*/
        System.out.println(isPalindrome(l1));
    }
}
