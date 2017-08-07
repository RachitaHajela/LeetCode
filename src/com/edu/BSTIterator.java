package com.edu;

import java.util.Stack;

/**
 * Created by RHAJELA on 7/28/2017.
 */
public class BSTIterator {
    TreeNode root;
    Stack<TreeNode> stack = new Stack<>();

    public BSTIterator(TreeNode root) {
        this.root = root;
        addElements(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
       if(stack.isEmpty()) {
           return false;
       }
       return true;
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode temp = stack.pop();
        addElements(root.right);
        return temp.val;
    }

    private void addElements(TreeNode root) {
        for(; root != null; root = root.left) {
            stack.push(root);
        }
    }

}
