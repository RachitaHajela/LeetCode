package com.edu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rachita on 5/22/2017.
 */
public class PathSum2 {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        pathSumHelper(root, sum, result, new ArrayList<Integer>(), 0);
        return result;
    }

    private void pathSumHelper(TreeNode root, int sum, List<List<Integer>> result, ArrayList<Integer> curList, int curSum) {
        if (root == null) return;
        curList.add(root.val);
        if (root.left == null && root.right == null && curSum + root.val == sum) {
            result.add(curList);
            return;
        }

        int newSum = curSum + root.val;
        pathSumHelper(root.left, sum, result, new ArrayList<Integer>(curList), newSum);
        pathSumHelper(root.right, sum, result, new ArrayList<Integer>(curList), newSum);


    }
}
