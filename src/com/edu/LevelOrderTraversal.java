package com.edu;

import java.util.*;

/**
 * Created by RHAJELA on 8/24/2016.
 */
public class LevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {

        /***1. use sol for levelOrder traversal 1.
         * 2.  use levels in the 2nd function and collections.reverse
         */

        List<List<Integer>> levelList = new ArrayList<>();
        if(root == null) {return levelList;}

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {

            int size = queue.size();
            List<Integer> nodes = new ArrayList<>();
            while(size != 0) {
                TreeNode temp = queue.pop();
                nodes.add(temp.val);
                size--;
                if(temp.left != null) {
                    queue.add(temp.left);
                }
                if(temp.right != null) {
                    queue.add(temp.right);
                }
            }
            levelList.add(nodes);    //can change this to levelList.add(0,nodes) for level order traversal II


        }
        return levelList;

    }
}
