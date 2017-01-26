package com.edu;

import java.util.*;

/**
 * Created by RHAJELA on 8/24/2016.
 */
public class LevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
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
            levelList.add(nodes);


        }
        return levelList;

    }
}
