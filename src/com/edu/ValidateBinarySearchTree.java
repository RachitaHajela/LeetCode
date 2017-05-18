package com.edu;

/**
 * Created by RHAJELA on 5/17/2017.
 */
public class ValidateBinarySearchTree {

    public boolean isValidBST(TreeNode root) {
        /* 1) Do In-Order Traversal of the given tree and store the result in a temp array.
        3) Check if the temp array is sorted in ascending order, if it is, then the tree is BST. */

        return isBST(root,Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);


       /*
       Correct but not efficient

       if (root == null || (root.left == null && root.right == null)) return true;

        if (root.left != null) {
            if (!lessThanAllValues(root.left, root.val)) return false;
        }

        if (root.right != null) {
            if (!moreThanAllValues(root.right, root.val)) return false;
        }
        return isValidBST(root.left) && isValidBST(root.right);*/
    }

    private boolean isBST(TreeNode root, double min, double max) {
        if(root == null) return true;

        if(root.val <= min || root.val >= max) return false;

        return isBST(root.left,min,root.val) && isBST(root.right,root.val,max);

    }

    private boolean lessThanAllValues(TreeNode root, int val) {
        if (root == null) return true;
        if (root.val >= val) return false;
        return lessThanAllValues(root.left, val) && lessThanAllValues(root.right, val);
    }

    private boolean moreThanAllValues(TreeNode root, int val) {
        if (root == null) return true;
        if (root.val <= val) return false;
        return moreThanAllValues(root.left, val) && moreThanAllValues(root.right, val);
    }
}
