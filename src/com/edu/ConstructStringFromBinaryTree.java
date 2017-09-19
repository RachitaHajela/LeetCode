package com.edu;

/**
 * Created by RHAJELA on 9/19/2017.
 */
public class ConstructStringFromBinaryTree {
    public String tree2str(TreeNode t) {
        StringBuilder sb = new StringBuilder("");

        helper(t,sb);
        return sb.toString();
    }

    private void helper(TreeNode t, StringBuilder sb) {
        if(t == null) return;
        sb.append(t.val);
        if(t.left != null || t.right != null) {
            sb.append("(");
            helper(t.left, sb);
            sb.append(")");
            if(t.right != null) {
                sb.append("(");
                helper(t.right, sb);
                sb.append(")");
            }

        }
    }
}
