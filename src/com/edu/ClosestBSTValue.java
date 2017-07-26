package com.edu;

/**
 * Created by RHAJELA on 7/24/2017.
 */
public class ClosestBSTValue {

    int goal;
    double min = Double.MAX_VALUE;

    public int closestValue(TreeNode root, double target) {
        helper(root, target);
        return goal;


        /** iterative solution
         *
         int closestVal = root.val;
         while(root != null){
         //update closestVal if the current value is closer to target
         closestVal = (Math.abs(target - root.val) < Math.abs(target - closestVal))? root.val : closestVal;
         if(closestVal == target){   //already find the best result
         return closestVal;
         }
         root = (root.val > target)? root.left: root.right;   //binary search
         }
         return closestVal;
         */
    }

    public void helper(TreeNode root, double target){
        if(root==null)
            return;

        if(Math.abs(root.val - target) < min){
            min = Math.abs(root.val-target);
            goal = root.val;
        }

        if(target < root.val){
            helper(root.left, target);
        }else{
            helper(root.right, target);
        }
    }



    /** this is considering that te closest value can lie in the greater side too. More like a DFS **/
    private int closestValueHelper(TreeNode root,double target,int closestVal, double min ) {
        if(root == null)
        return closestVal;

        if (Math.abs(root.val - target) < min) {
            closestVal = root.val;
            min = Math.abs(root.val - target);
        }
        int leftVal = closestValueHelper(root.left,target,closestVal,min);
        int rightVal = closestValueHelper(root.right,target,closestVal,min);

        if(Math.abs(leftVal - target) < Math.abs(rightVal - target))return leftVal;
        else return rightVal;
    }
}
