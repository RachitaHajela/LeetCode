package com.edu;

/**
 * Created by RHAJELA on 8/23/2016.
 */
public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        return isMirror(root,root);
}

    private boolean isMirror(TreeNode left, TreeNode right) {
        if(left == null && right == null) return true;
        if(left == null || right == null) return false;
        if(left.val != right.val) return false;
        else{
            return isMirror(left.left,right.right) && isMirror(left.right,right.left);
        }
    }
    }
