package com.edu;

/**
 * Created by rhajela on 4/19/2017.
 */
public class LowestCommonAncestorBST {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        /**
         * If the given both nodes values are less than that of root, then both the nodes must be on the left side of the root , so now we have to check only left tree of the root.
         Otherwise If the given both nodes values are greater than that of root, then both the nodes must be on the right side of the root , so now we have to check only right tree of the root.
         Otherwise . both the nodes will be on the either side of the root, this implies the lowest common ancestor is root
         */

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
