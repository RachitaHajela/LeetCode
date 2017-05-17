package com.edu;

/**
 * Created by Rachita on 5/16/2017.
 */
public class ConstructBinaryTreePreorderInorder {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int preStart = 0, preEnd = preorder.length-1;
        int inStart  = 0, inEnd = inorder.length-1;
        return buildHelper(preStart,preEnd,inStart,inEnd,preorder,inorder);
    }

    private TreeNode buildHelper(int preStart, int preEnd, int inStart, int inEnd, int[] preorder, int[] inorder) {
        if(preStart > preEnd || inStart > inEnd) return null;

        int val = preorder[preStart];
        TreeNode root = new TreeNode(val);

        int k = 0;
        for(int i =0 ; i<inorder.length; i++) {
            if(val == inorder[i]) {
                k = i;
                break;
            }
        }
        root.left = buildHelper(preStart+1,preStart + k -inStart,inStart,k-1,preorder,inorder);
        root.right =  buildHelper(preStart + (k-inStart)+1,preEnd,k+1,inEnd,preorder,inorder);
        return root;
    }
}
