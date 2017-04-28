package com.edu;

/**
 * Created by RHAJELA on 4/28/2017.
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode result = l1;
        int val = 0;
        int carry = 0;

        while (l1.next != null && l2.next != null) {
            val = l1.val + l2.val + carry;
            carry = 0;
            if (val >= 10) {
                val = val - 10;
                carry = 1;
            }
            l1.val = val;
            l1 = l1.next;
            l2 = l2.next;
        }

        if (l2.next == null && l1.next == null) {
            val = l1.val + l2.val + carry;
            carry = 0;
            if(val >= 10) {
                l1.val = val - 10;
                ListNode l = new ListNode(1);
                l1.next = l;
            }
            else {
                l1.val = val;
            }
            return result;
        }

        if(l2.next == null) {
            val = l1.val + l2.val + carry;
            carry = 0;
            if (val >= 10) {
                carry = 1;
                l1.val = val - 10;
                l1.next = l1;
            }
            else {
                l1.val = val;
                return result;
            }
            while(carry == 1 && l1.next != null) {
                if(l1.val + carry >= 10) {
                    l1.val = l1.val + carry -10;
                    carry = 1;
                    l1 = l1.next;
                }
                else {
                    l1.val = l1.val + carry;
                    return result;
                }
            }
        }
        return result;
    }
}
