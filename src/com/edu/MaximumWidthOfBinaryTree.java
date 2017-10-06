package com.edu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by RHAJELA on 10/5/2017.
 */
public class MaximumWidthOfBinaryTree {

    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        ArrayList<TreeNode> queue = new ArrayList<>();
        queue.add(root);
        int maxDistance = 0;

        while (!queue.isEmpty()) {
            int start = 0;
            int end = queue.size() - 1;
            int numOfElements = queue.size();

            while(start <= end && queue.get(start) == null) {
                start++;
            }
            while(end >= 0 && queue.get(end) == null) {
                end--;
            }

            int count = 0;
            ArrayList<TreeNode> temp = new ArrayList<>();
            for(int i = start; i<= end; i++) {
                count++;

                if(queue.get(i) == null) {
                    temp.add(null);
                    temp.add(null);
                }
                else {
                    temp.add(queue.get(i).left);
                    temp.add(queue.get(i).right);
                }

            }
            maxDistance = Math.max(maxDistance,count);

           queue = temp;
        }
        return maxDistance;

    }

}
