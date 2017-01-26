package com.edu;

/**
 * Created by RHAJELA on 8/25/2016.
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
public class MaximumDepth {

    public int maxDepth(TreeNode root) {

        return  maxDepthHelper(root, 0);
    }
    private int maxDepthHelper(TreeNode root, int depth) {
     if(root == null) return depth;
        return (Math.max(maxDepthHelper(root.left,depth+1),maxDepthHelper(root.right,depth+1)));
    }


}
