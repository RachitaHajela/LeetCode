package com.edu;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by RHAJELA on 8/8/2017.
 */
public class MergeKsortedLists {

    public ListNode mergeKLists(ListNode[] lists) {
        int k = lists.length;
        PriorityQueue<ListNode> heap = new PriorityQueue<ListNode>(k, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        for(int i = 0; i< k; i++) {
            if(lists[i] != null)
            heap.add(lists[i]);
        }

        while(!heap.isEmpty()) {
            ListNode node = heap.poll();
            cur.next = node;
            cur = cur.next;
            node = node.next;
            if(node != null) {
                heap.add(node);
            }
        }

        return dummy.next;
    }
}
