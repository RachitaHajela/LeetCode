package com.edu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by RHAJELA on 10/6/2017.
 */
public class BoundaryOfABinaryTree {
    ArrayList<TreeNode> leftBoundary = new ArrayList<>();
    ArrayList<TreeNode> rightBoundary = new ArrayList<>();
    ArrayList<TreeNode> leaves = new ArrayList<>();

    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        leftBoundary.add(root);
        if (root.left != null) {
            System.out.println("calling left boundary");
            findLeftBoundary(root.left);
        }
        if (root.right != null) {
            findRightBoundary(root.right);
        }

        findLeaves(root);
        System.out.println("Left indx : ");
        for (int i = 0; i < leftBoundary.size(); i++) {
            System.out.print(leftBoundary.get(i).val + ", ");
        }
        System.out.println("");
        System.out.println("Right indx : ");
        for (int i = 0; i < rightBoundary.size(); i++) {
            System.out.print(rightBoundary.get(i).val + ", ");
        }
        System.out.println("");
        System.out.println("Leaves: ");
        for (int i = 0; i < leaves.size(); i++) {
            System.out.print(leaves.get(i).val + ", ");
        }

        for (int i = 0; i < leftBoundary.size(); i++) {
            result.add(leftBoundary.get(i).val);
        }
        for (int i = 0; i < leaves.size(); i++) {
            if (i == 0 && leaves.get(i).equals(leftBoundary.get(leftBoundary.size() - 1))) {
                continue;
            }
            result.add(leaves.get(i).val);
        }
        for (int i = 0; i < rightBoundary.size(); i++) {
            if (i == 0 && rightBoundary.get(i).equals(leaves.get(leaves.size() - 1))) {
                continue;
            }
            result.add(rightBoundary.get(i).val);
        }
        return result;
    }

    private void findLeftBoundary(TreeNode root) {
        if (root == null) return;
        leftBoundary.add(root);
        if (root.left == null) {
            findLeftBoundary(root.right);
        } else {
            findLeftBoundary(root.left);
        }
    }

    private void findRightBoundary(TreeNode root) {
        if (root == null) return;
        if (root.right == null) {
            findRightBoundary(root.left);
        } else {
            findRightBoundary(root.right);
        }
        rightBoundary.add(root);
    }

    private void findLeaves(TreeNode root) {

        if (root == null) return;
        if (root.left == null && root.right == null) {
            leaves.add(root);
        } else {
            findLeaves(root.left);
            findLeaves(root.right);
        }

    }
}
