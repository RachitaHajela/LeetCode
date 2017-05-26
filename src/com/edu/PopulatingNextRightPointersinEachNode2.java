package com.edu;

/**
 * Created by RHAJELA on 5/24/2017.
 */
public class PopulatingNextRightPointersinEachNode2 {

    public void connect(TreeLinkNode root) {
        if(root == null) return;
        TreeLinkNode curr = root;
        while (curr != null) {
            TreeLinkNode runner = curr;

            while(runner != null) {
                if(runner.left != null) {
                    runner.left.next = runner.right != null ? runner.right : findNextNode(runner.next);
                }
                if(runner.right != null) {
                    runner.right.next = findNextNode(runner.next);
                }
                runner = runner.next;
            }
            curr = findNextNode(curr);
        }
    }

    private TreeLinkNode findNextNode(TreeLinkNode node) {
        while (node != null) {
            if(node.left != null) return node.left;
            if(node.right != null) return node.right;
            node = node.next;
        }
        return null;
    }
}
