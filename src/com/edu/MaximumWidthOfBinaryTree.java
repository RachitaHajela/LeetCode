package com.edu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by RHAJELA on 10/5/2017.
 */
public class MaximumWidthOfBinaryTree {

    public int widthOfBinaryTree(TreeNode root) {
        if(root == null || root.left == null || root.right == null) return 0;

        ArrayList<TreeNode> queue = new ArrayList<>();
        queue.add(root.left);
        queue.add(root.right);
        int maxDistance = 0;

        while(!queue.isEmpty()) {
            int size = queue.size();

            while(size!= 0) {
                



            }
        }

    }


}
