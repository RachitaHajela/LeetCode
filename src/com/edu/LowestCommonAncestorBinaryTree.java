package com.edu;

import sun.reflect.generics.tree.Tree;

/**
 * Created by RHAJELA on 7/27/2017.
 */
public class LowestCommonAncestorBinaryTree {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root == null)
            return null;

        if(root == p || root == q ) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);

        if(left != null && right != null) {
            return root;
        }
        return left != null ? left : right;

    }
}
