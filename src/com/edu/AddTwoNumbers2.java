package com.edu;

import java.util.Stack;

/**
 * Created by RHAJELA on 5/12/2017.
 */
public class AddTwoNumbers2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        /** using stack **/
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        while (l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }
        int carry = 0, sum = 0, x = 0, y = 0;
        ListNode curr = null;

        while (!s1.empty() || !s2.empty()) {
            x = s1.empty() ? 0 : s1.pop();
            y = s2.empty() ? 0 : s2.pop();
            sum = (x + y + carry) % 10;
            carry = (x + y + carry) / 10;
            ListNode temp = new ListNode(sum);
            temp.next = curr;
            curr = temp;
        }
        if (carry > 0) {
            ListNode temp = new ListNode(carry);
            temp.next = curr;
            curr = temp;
        }
        return curr;
        /** Brute Force First Solution : Finding length of the lists and then add. Can improve using stack **/
        /*ListNode dummy = new ListNode(0);
        ListNode p = l1;
        ListNode q = l2;
        ListNode curr = dummy.next;
        int x = 0, y = 0, sum = 0, carry = 0;

        int len1 = 0;
        int len2 = 0;

        while (p != null) {
            len1++;
            p = p.next;
        }

        while (q != null) {
            len2++;
            q = q.next;
        }

        while (len1 > 0 || len2 > 0) {
            p = l1;
            q = l2;
            int tmp1 = len1;
            int tmp2 = len2;

            while (tmp1 > 1) {
                p = p.next;
                tmp1--;
            }
            while (tmp2 > 1) {
                q = q.next;
                tmp2--;
            }

            x = len1 > 0 ? p.val : 0;
            y = len2 > 0 ? q.val : 0;
            sum = (x + y + carry) % 10;
            carry = (x + y + carry) / 10;
            ListNode temp = new ListNode(sum);
            temp.next = curr;
            curr = temp;

            len1--;
            len2--;
        }
        if (carry > 0) {
            ListNode temp = new ListNode(carry);
            temp.next = curr;
            curr = temp;
        }
        return curr;*/
    }
}
