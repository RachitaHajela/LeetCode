package com.edu;

/**
 * Created by RHAJELA on 8/14/2017.
 */
public class SortedArrayToBST {

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        int low = 0;
        int high = nums.length-1;
        return BSTHelper(low,high,nums);
    }

    private TreeNode BSTHelper(int low, int high, int[] nums) {
        if(low > high) return null;
        int mid = low + (high - low)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = BSTHelper(low,mid-1,nums);
        node.right = BSTHelper(mid+1,high,nums);
        return node;
    }
}
