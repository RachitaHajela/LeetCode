package com.edu;

/**
 * Created by RHAJELA on 3/7/2017.
 */
public class PathSum {

    public boolean hasPathSum(TreeNode root, int sum) {

        if (root == null) return false;
        else if ((sum - root.val == 0) && root.left == null && root.right == null) return true;
        else return (hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val));
    }
}

