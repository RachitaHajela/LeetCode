package com.edu;

import org.omg.PortableInterceptor.INACTIVE;
import sun.reflect.generics.tree.Tree;

import java.util.*;

/**
 * Created by RHAJELA on 5/13/2017.
 */
public class ZigZagLevelOrderTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> resList  = new ArrayList<List<Integer>>();
        if(root == null) return resList;
        LinkedList<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        boolean reverse = true;
        while(!queue.isEmpty()) {
            List<Integer> nodes = new ArrayList<>();
            int size = queue.size();

            while(size != 0) {
                TreeNode temp = queue.pop();
                nodes.add(temp.val);
                if(temp.left != null) {
                    queue.add(temp.left);
                }
                if(temp.right != null) {
                    queue.add(temp.right);
                }
                size--;
            }
            if(reverse) {
                resList.add(nodes);
            }else
            {
                Collections.reverse(nodes);
                resList.add(nodes);
            }
            reverse = !reverse;

        }


        return resList;
    }
}
