package com.edu;

import java.util.HashMap;

/**
 * Created by RHAJELA on 10/9/2017.
 */
public class EqualTreePartition {

    HashMap<TreeNode, Integer> sumValues = new HashMap<>();

    public boolean checkEqualTree(TreeNode root) {
        storeSumValues(root);
        if (helper(root, root.left) || helper(root, root.right)) {
            return true;
        }
        return false;
    }

    private boolean helper(TreeNode root, TreeNode until) {
        if (until == null) return false;
        int partSum1 = sumValues.get(root) - sumValues.get(until);
        int partSum2 = sumValues.get(until);
        if (partSum1 == partSum2) return true;
        else {
            return (helper(root, until.left) || helper(root, until.right));
        }
    }

    private int storeSumValues(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) {
            sumValues.put(root, root.val);
            //System.out.println("sum value for: "+ root.val + "is "+root.val);
            return root.val;
        } else {
            int val1 = storeSumValues(root.left);
            int val2 = storeSumValues(root.right);
            sumValues.put(root, root.val + val1 + val2);
            //System.out.println("sum value for: "+ root.val + "is "+(root.val+val1+val2));
            return root.val + val1 + val2;
        }
    }
}
