package com.edu;

import java.util.HashMap;

/**
 * Created by RHAJELA on 5/12/2017.
 */
public class CopyListWithRandomPointer {

    public RandomListNode copyRandomList(RandomListNode head) {

        /** using hashmap **/
        if(head == null) return head;
        RandomListNode newHead = new RandomListNode(head.label);
        HashMap<RandomListNode,RandomListNode> map = new HashMap<>();

        RandomListNode p = head;
        RandomListNode q = newHead;
        map.put(head,newHead);
        p=p.next;
        while(p != null ) {
            RandomListNode temp = new RandomListNode(p.label);
            map.put(p,temp);
            q.next = temp;
            q = temp;
            p = p.next;
        }
        p = head;
        q = newHead;
        while(p != null) {
            if(p.random != null) {
                q.random = map.get(p.random);
            }
            else {
                q.random = null;
            }
            p = p.next;
            q = q.next;
        }
        return newHead;
       /* We can solve this problem by doing the following steps:

        copy every node, i.e., duplicate every node, and insert it to the list
        copy random pointers for all newly created nodes
        break the list to two*/
    }
}
