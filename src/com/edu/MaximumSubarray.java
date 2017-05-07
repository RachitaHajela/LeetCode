package com.edu;

/**
 * Created by Rachita on 4/24/2017.
 */
public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int size = nums.length;
        int maxSoFar = nums[0];
        int currMax = nums[0];

        for (int i=1; i<size; i++) {
            currMax = Math.max(currMax + nums[i], nums[i]);
            maxSoFar = Math.max(maxSoFar, currMax);
        }

        return maxSoFar;
    }
}
