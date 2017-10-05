package com.edu;

import java.util.*;

/**
 * Created by RHAJELA on 10/5/2017.
 */
public class MostFrequentSubTreeSum {

    HashMap<Integer,Integer> map = new HashMap<>();
    int maxCount;

    public int[] findFrequentTreeSum(TreeNode root) {
        maxCount = 0;

        dfs(root);

        List<Integer> sumList = new ArrayList<>();

        for (int key : map.keySet()) {
            if(map.get(key) == maxCount) {
                sumList.add(key);
            }
        }
        int[] result = new int[sumList.size()];
        for(int i = 0; i< sumList.size(); i++) {
            result[i] = sumList.get(i);
        }
        return result;

    }

    private int dfs(TreeNode root) {
        if(root == null) return 0;
        int val = root.val + dfs(root.left) + dfs(root.right);
        if(map.containsKey(val)) {
            map.put(val,map.get(val)+1);
        }else {
            map.put(val,1);
        }
        maxCount = Math.max(maxCount,map.get(val));
        return val;
    }
}
