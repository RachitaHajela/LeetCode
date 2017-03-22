package com.edu;

/**
 * Created by RHAJELA on 3/22/2017.
 */
public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        return maxHeight(root) != -1;


        /**** O(n^2)
         /*if (root == null) {
         return true;
         }
         int lh = height(root.left);
         int lr = height(root.right);

         if (isBalanced(root.right) && isBalanced(root.left) && Math.abs(lh - lr) <= 1) return true;

         return false;*/
    }

    private int maxHeight(TreeNode root) {
        if (root == null) return 0;
        int lh = maxHeight(root.left);
        if (lh == -1) return -1;
        int rh = maxHeight(root.right);
        if (rh == -1) return -1;
        if(Math.abs(lh-rh)>1) return -1;
        return 1 + Math.max(lh, rh);
    }
    /*private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        else {
            return 1+ (Math.max(height(root.left),height(root.right)));
        }
    }*/
}
