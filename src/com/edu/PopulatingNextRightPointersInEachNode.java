package com.edu;

import java.util.LinkedList;

/**
 * Created by RHAJELA on 5/24/2017.
 */
public class PopulatingNextRightPointersInEachNode {

    public void connect(TreeLinkNode root) {
        if (root == null) return;
        root.next = null;
        //connectToRight(root);
        connectToRightConstant(root);
    }

    /** function with constant space : **/
     private void connectToRightConstant(TreeLinkNode root) {
         TreeLinkNode levelStart = root;
         while(levelStart != null) {
             TreeLinkNode cur = levelStart;

             while(cur != null) {

                 if(cur.left != null) {
                     cur.left.next = cur.right;
                 }
                 if(cur.right != null && cur.next != null) {
                     cur.right.next = cur.next.left;
                 }
                 cur = cur.next;
             }
             levelStart = levelStart.left;
         }
     }

    /**
     * this approach only works for complete Binary tree. It is also not constant space.
     */
    private void connectToRight(TreeLinkNode root) {
        if (root == null || root.left == null) return;

        root.left.next = root.right;
        root.right.next = root.next != null ? root.next.left : null;

        connectToRight(root.left);
        connectToRight(root.right);

    }
}
