package com.edu;

/**
 * Created by Rachita on 3/6/2017.
 */
public class MinDepthBinaryTree {

    public int minDepth(TreeNode root) {
        int depth = 0;
        return minDepthHelper(root, depth);
    }

    private int minDepthHelper(TreeNode root, int depth) {
        if (root == null) {
            return depth;
        } else {
            return Math.min(minDepthHelper(root.left, depth + 1), minDepthHelper(root.right, depth + 1));
        }

    }
}
