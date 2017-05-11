package com.edu;

import java.util.ArrayList;

/**
 * Created by Rachita on 5/10/2017.
 */
public class KthSmallestElementBST {

    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> values = new ArrayList<>();
        putValues(root,values);
        System.out.print(values.size());
        return values.get(k-1);

    }

    private void putValues(TreeNode root, ArrayList values) {
        if(root.left == null && root.right == null) {
            values.add(root.val);
        }
        else {
            if(root.left != null)
            { putValues(root.left,values);}
            values.add(root.val);
            if(root.right != null)
            { putValues(root.right,values); }
        }
    }


}
