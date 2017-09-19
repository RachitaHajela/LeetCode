package com.edu;

/**
 * Created by RHAJELA on 9/19/2017.
 */
public class MergeTwoBinaryTrees {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        return helper(t1,t2);

        /** easy one
         *
         *  if (t1 == null) return t2;
         if (t2 == null) return t1;
         t1.val = t1.val + t2.val;
         t1.left = mergeTrees(t1.left,t2.left);
         t1.right = mergeTrees(t1.right,t2.right);
         return t1;
         *
         *
         *
         * **/
    }

    private TreeNode helper(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null) return null;
        int sum = 0;
        sum += t1 != null ? t1.val : 0;
        sum += t2 != null ? t2.val : 0;
        TreeNode res = new TreeNode(sum);


        res.left = helper(t1 != null? t1.left : null, t2 != null ? t2.left : null);
        res.right = helper(t1 != null ? t1.right : null,t2 != null ? t2.right : null);


        return res;
    }
}
