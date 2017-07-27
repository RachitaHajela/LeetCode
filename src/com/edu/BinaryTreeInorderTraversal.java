package com.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by RHAJELA on 7/27/2017.
 */
public class BinaryTreeInorderTraversal {

    /** Recursive solution is trivial, could you do it iteratively? **/
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode cur = root;
        while(cur != null || !stack.isEmpty()) {
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            result.add(cur.val);
            cur = cur.right;
        }
        return result;
    }
}
