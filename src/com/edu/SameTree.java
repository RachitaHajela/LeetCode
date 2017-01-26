package com.edu;

/**
 * Created by RHAJELA on 8/23/2016.
 */
public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) {
            return true;
        }else if(p==null || q==null) {
            return false;
        }
        if(p.val != q.val) {
            return false;
        }
       else {
           return (isSameTree(p.left,q.left) && isSameTree(p.right,q.right));
        }
    }
}
