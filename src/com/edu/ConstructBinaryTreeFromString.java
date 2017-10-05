package com.edu;

import sun.reflect.generics.tree.Tree;

/**
 * Created by RHAJELA on 10/4/2017.
 */
public class ConstructBinaryTreeFromString {

    private int i = 0;

    public TreeNode str2tree(String s) {
        if (s.equals("")) return null;
        TreeNode root = helper(s.toCharArray());
        return root;
    }

    private TreeNode helper(char[] values) {
        TreeNode root = null;

        if (i == values.length) {
            return null;
        }
        int val = getIntVal(values);
        root = new TreeNode(val);

        TreeNode left = null, right = null;
        if (i < values.length && values[i] == '(') {
            i++;
            left = helper(values);
        }
        if (i < values.length && values[i] == '(') {
            i++;
            right = helper(values);
        }
        root.left = left;
        root.right = right;
        i++;
        return root;
    }

    private int getIntVal(char[] values) {

        StringBuilder sb = new StringBuilder();
        while (i < values.length && (values[i] == '-' || Character.isDigit(values[i]))) {
            sb.append(values[i]);
            i++;
        }
        int val = Integer.valueOf(sb.toString());
        return val;

    }
}
