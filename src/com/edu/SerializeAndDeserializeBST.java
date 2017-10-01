package com.edu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Rachita on 9/30/2017.
 */
public class SerializeAndDeserializeBST {


    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder("");

        if(root == null) return sb.toString();

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty()) {
            int size = queue.size();

            while(size != 0) {
                TreeNode node = queue.poll();
                sb.append(node.val+",");
                if(node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null) {
                    queue.add(node.right);
                }
                size--;
            }
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.print(sb.toString());
        return sb.toString();

    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] values = data.split(",");
        if(values.length == 0) return null;

        TreeNode root  = new TreeNode(Integer.parseInt(values[0]));
        TreeNode curr = root;

        for(int i =1; i < values.length ; i++) {
            curr = root;
            int valToPut = Integer.parseInt(values[i]);

            while(valToPut < curr.val && curr.left != null) {
                curr = curr.left;
            }
            while(valToPut >= curr.val && curr.right != null) {
                curr = curr.right;
            }

            if(valToPut < curr.val) {
                curr.left = new TreeNode(valToPut);
            }else {
                curr.right = new TreeNode(valToPut);
            }
        }
        return root;
    }
}
