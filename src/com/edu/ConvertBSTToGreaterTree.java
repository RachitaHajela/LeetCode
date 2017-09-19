package com.edu;

/**
 * Created by RHAJELA on 9/19/2017.
 */
public class ConvertBSTToGreaterTree {

    public TreeNode convertBST(TreeNode root) {
        helper(root,0);
        return root;
    }

    private int helper(TreeNode root, int sum) {
        if(root == null) return sum;
        root.val += helper(root.right,sum);
        return helper(root.left,root.val);
    }
}
