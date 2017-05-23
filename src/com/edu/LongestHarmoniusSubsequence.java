package com.edu;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by RHAJELA on 5/20/2017.
 */
public class LongestHarmoniusSubsequence {

    public int findLHS(int[] nums) {

        int max = 0;
        if (nums.length < 2) return max;
        int maxLen[] = new int[nums.length];
        maxLen[0] = 0;

        for (int i = 1; i < nums.length; i++) {

            int min = findMin(nums, i);
            int curMax = findMax(nums, i);
            if (curMax - min == 1) {
                maxLen[i] = 1 + maxLen[i - 1];
                max++;
            } else {
                maxLen[i] = maxLen[i - 1];
            }
        }
        return max;
    }

    private int findMin(int[] nums, int i) {
        int min = nums[0];
        for (int j = 1; j<= i; j++) {
            if(nums[j] < min) {
                min = nums[j];
            }
        }
        return min;
    }
    private int findMax(int[] nums, int i) {
        int max = nums[0];
        for (int j = 1; j<= i; j++) {
            if(nums[j] > max) {
                max = nums[j];
            }
        }
        return max;
    }

}

