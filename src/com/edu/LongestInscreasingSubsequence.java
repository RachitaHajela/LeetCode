package com.edu;

/**
 * Created by RHAJELA on 10/3/2017.
 */
public class LongestInscreasingSubsequence {

    public int lengthOfLIS(int[] nums) {

        //O(n^2) can be resuced to nlogn by binary search
        if (nums.length <= 1) return nums.length;
        int maxLen = 0;
        int n = nums.length;
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }

        for (int i = 1; i < n; i++) {

            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], 1 + dp[j]);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            maxLen = Math.max(maxLen, dp[i]);
        }
        return maxLen;
    }
}
