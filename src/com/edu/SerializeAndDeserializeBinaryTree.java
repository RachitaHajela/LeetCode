package com.edu;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Rachita on 9/30/2017.
 *
 */
//Difference in  this and BT is that in this case no need to save null values.
public class SerializeAndDeserializeBinaryTree {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
       if(root == null) return null;
       StringBuilder sb = new StringBuilder("");
       serHelper(root,sb);
       sb.deleteCharAt(sb.length()-1);
       System.out.print(sb.toString());
       return sb.toString();

    }

    private void serHelper(TreeNode root, StringBuilder sb) {
        if(root == null) {
            return;
        }
        sb.append(root.val+",");
        serHelper(root.left,sb);
        serHelper(root.right,sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null || data.length() == 0) {
            return null;
        }
        String[] vals = data.split(",");
        int[] index = new int[]{0};
        return deserHelper(vals,index, Long.MIN_VALUE,Long.MAX_VALUE);
    }

    private TreeNode deserHelper(String[] vals, int[] index, long min, long max) {
        if(index[0] > vals.length) {return null;}
        TreeNode root = null;
        int rootVal = Integer.parseInt(vals[index[0]]);
        if (rootVal > min && rootVal < max) {
            root = new TreeNode(rootVal);
            index[0]++;
            root.left = deserHelper(vals, index, min, rootVal);
            root.right = deserHelper(vals, index, rootVal, max);
        }
        return root;
    }
}
