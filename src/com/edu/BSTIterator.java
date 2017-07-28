package com.edu;

import java.util.Stack;

/**
 * Created by RHAJELA on 7/28/2017.
 */
public class BSTIterator {
    TreeNode root;
    Stack<TreeNode> stack = new Stack<>();
    boolean allAdded = false;
    public BSTIterator(TreeNode root) {
        this.root = root;
        if(root != null)
        {
            stack.add(root);
            addElements(root.left);
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if(stack.isEmpty() && !allAdded && root != null) {
            addElements(root.right);
            allAdded = true;
        }
        if(stack.isEmpty()) {
            return false;
        }
        return true;
    }

    /** @return the next smallest number */
    public int next() {
        return stack.pop().val;
    }

    private void addElements(TreeNode root) {
        if(root == null) return;
        addElements(root.right);
        stack.add(root);
        addElements(root.left);
    }

}
