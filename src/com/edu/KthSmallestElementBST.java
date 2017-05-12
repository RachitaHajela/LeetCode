package com.edu;

import java.util.ArrayList;

/**
 * Created by Rachita on 5/10/2017.
 */
public class KthSmallestElementBST {
    /** Divide and Conquer. O(h) **/
    public int kthSmallest(TreeNode root, int k) {
        int count = numOfNodes(root.left);
        if(k <= count) {
            return kthSmallest(root.left,k);
        }
        else if(k > count + 1) {
            return kthSmallest(root.right, k-1-count);
        }
        return root.val;
        /* Inorder traversal
        ArrayList<Integer> values = new ArrayList<>();
        putValues(root,values);
        System.out.print(values.size());
        return values.get(k-1);*/

    }

    private int numOfNodes(TreeNode root) {
        if (root == null) return 0;
        else return 1+ numOfNodes(root.left) + numOfNodes(root.right);
    }
    /*private void putValues(TreeNode root, ArrayList values) {
        if(root.left == null && root.right == null) {
            values.add(root.val);
        }
        else {
            if(root.left != null)
            { putValues(root.left,values);}
            values.add(root.val);
            if(root.right != null)
            { putValues(root.right,values); }
        }
    }*/


}
