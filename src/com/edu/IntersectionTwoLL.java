package com.edu;

/**
 * Created by RHAJELA on 3/1/2017.
 */
public class IntersectionTwoLL {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        /* Two Loops :
        if(headA == null || headB == null) return null;
        ListNode listA = headA;
        ListNode listB = headB;

        while(listA != null) {
            listB = headB;
            while(listB != null) {
                if(listA == listB)
                {  return listA;}
                listB = listB.next;
            }
            listA = listA.next;
        }
        return null;*/

        ListNode listA = headA;
        ListNode listB = headB;

        int c1 = getCount(headA);
        int c2 = getCount(headB);
        int diff  = 0;
        if(c1>c2) {
            diff = c1-c2;

            while(diff != 0 ) {

            }
        }

        return null;
    }

    private int getCount(ListNode headA) {
        int count = 0;
        ListNode current = headA;

        while(current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}
