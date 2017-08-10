package com.edu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by RHAJELA on 8/10/2017.
 */
public class SortList {

    public ListNode sortList(ListNode head) {

        /** using merge sort **/
        ListNode dummy = new ListNode(0);
        dummy.next = mergeSort(head);
        return dummy.next;

        /*
        Poor Solution

        if(head == null) return head;
        ArrayList<Integer> nums = new ArrayList<>();
        ListNode temp = head;
        while(temp != null) {
            nums.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(nums);

        temp = head;
        for(int num : nums) {
            temp.val = num;
            temp = temp.next;
        }

        return head;*/
    }

    private ListNode mergeSort(ListNode head) {
        if(head == null || head.next == null) return head;

        //find middle element. Divide the list.
        ListNode middle = getMiddle(head);
        ListNode nextOfMiddle = middle.next; //start of other half.

        middle.next = null; //set next of middle to null.

        ListNode left = mergeSort(head);
        ListNode right = mergeSort(nextOfMiddle);

        ListNode sorted = sortedMerge(left,right);
        return sorted;

    }

    private ListNode getMiddle(ListNode head) {
        if(head == null) return head;

        ListNode fast = head.next;
        ListNode slow = head;

        while(fast != null) {
            fast = fast.next;
            if(fast != null) {
                slow = slow.next;
                fast = fast.next;
            }
        }
        return slow;
    }

    private ListNode sortedMerge(ListNode a, ListNode b) {
        ListNode result = null;

        if(a == null) return b;
        if(b == null) return a;

        if(a.val <= b.val) {
            result = a;
            result.next = sortedMerge(a.next,b);
        }else {
            result = b;
            result.next = sortedMerge(a,b.next);
        }
        return result;
    }
}
