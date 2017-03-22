package com.edu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RHAJELA on 3/22/2017.
 */
public class BinaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> solution = new ArrayList<>();

        if (root != null) {
            findPaths(root, "", solution);
        }
        return solution;

    }

    private void findPaths(TreeNode root, String path, List<String> solution) {
        if (root.left == null && root.right == null) {
            solution.add(path + root.val);
        }
        if (root.left != null) {

            findPaths(root.left, path + root.val + "->", solution);
        }
        if (root.right != null) {
            findPaths(root.right, path + root.val + "->", solution);
        }

    }

}
