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
        if(headA == null || headB == null) return null;
        ListNode listA = headA;
        ListNode listB = headB;

        int c1 = getCount(headA);
        int c2 = getCount(headB);
        int diff  = 0;
        if(c1>c2) {
            diff = c1-c2;

            while(diff != 0 ) {
                listA = listA.next;
                diff--;
            }
        }
        else if(c2>c1) {
            diff = c2-c1;
            while(diff != 0) {
                listB = listB.next;
                diff--;
            }
        }
        while(listA != null || listB != null) {
            if(listA == listB) {
                return listA;
            }
            listA = listA.next;
            listB = listB.next;
        }

        return null;

        /* 2 pointer approach :
         ListNode a = headA;
    ListNode b = headB;

    //if a & b have different len, then we will stop the loop after second iteration
    while( a != b){
    	//for the end of first iteration, we just reset the pointer to the head of another linkedlist
        a = a == null? headB : a.next;
        b = b == null? headA : b.next;
    }

    return a;
         */
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
