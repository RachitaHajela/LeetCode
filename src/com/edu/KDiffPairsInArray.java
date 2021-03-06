package com.edu;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by RHAJELA on 9/19/2017.
 */
public class KDiffPairsInArray {

    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0) return 0;

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i : nums) {
            // map.put(i, map.getOrDefault(i, 0) + 1);  works with only 1.8
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (k == 0) {
                if (e.getValue() >= 2) {
                    count++;
                }
            } else {
                if (map.containsKey(e.getKey() + k)) {
                    count++;
                }
            }
        }
        return count;
    }
}