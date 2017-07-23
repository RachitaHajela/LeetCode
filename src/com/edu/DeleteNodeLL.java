package com.edu;

/**
 * Created by Rachita on 7/23/2017.
 * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.

 Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, the linked list should become 1 -> 2 -> 4 after calling your function.
 */
public class DeleteNodeLL {


    public void deleteNode(ListNode node) {
        //we have to replace the value of the node we want to delete with the value in the node after it, and then delete the node after it
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
