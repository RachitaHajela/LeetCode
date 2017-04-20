package com.edu;

/**
 * Created by RHAJELA on 4/4/2017.
 */
public class HouseRobber {

    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        int[] maxSum = new int[nums.length+1];
        maxSum[0] = 0;
        maxSum[1] = nums[0];

        for (int i=2; i<= nums.length; i++) {
            maxSum[i] = Math.max(maxSum[i-2] + nums[i-1], maxSum[i-1]);
        }

        return maxSum[nums.length];
        
    }
}
