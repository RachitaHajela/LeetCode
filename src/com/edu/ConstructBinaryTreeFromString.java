package com.edu;

/**
 * Created by RHAJELA on 10/4/2017.
 */
public class ConstructBinaryTreeFromString {

    public TreeNode str2tree(String s) {
        TreeNode root = null;
        if(s.length() == 0) {
            return root;
        }

        char[] values = s.toCharArray();


        root = createTree(values, 0, values.length-1);
        return root;
    }

    private TreeNode createTree(char[] values, int start, int end) {
        TreeNode root = null ;
        if(start == end) {
            root = new TreeNode(Integer.parseInt(""+values[start]));
            return root;
        }
        String v = "";
        if(values[start] == '-') {
            v = v+"-";
            start++;
        }
        v = v + values[start];
        start++;
        root = new TreeNode(Integer.parseInt(v));
        if(start < end) {
           createSubTrees(root,values,start,end);
        }

        return root;
    }

    private void createSubTrees(TreeNode root, char[] values, int start, int end) {
        int startLef



    }
}
