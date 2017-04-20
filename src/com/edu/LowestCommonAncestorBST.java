package com.edu;

/**
 * Created by rhajela on 4/19/2017.
 */
public class LowestCommonAncestorBST {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root == null) return root;

        if(root.val > p.val && root.val >q.val) {
            return lowestCommonAncestor(root.left,p,q);
        }
        else if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right,p,q);
        }
        else return root;
    }
}
