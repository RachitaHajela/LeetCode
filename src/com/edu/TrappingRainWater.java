package com.edu;

/**
 * Created by RHAJELA on 10/10/2017.
 */
public class TrappingRainWater {

    public int trap(int[] height) {
        /*int ans = 0;
        int size = height.length;

        for (int i = 1; i < size - 1; i++) {

            int maxLeft = 0, maxRight = 0;
            for (int j = i; j >= 0; j--) {
                maxLeft = Math.max(maxLeft, height[j]);
            }

            for (int j = i; j < size; j++) {
                maxRight = Math.max(maxRight, height[j]);
            }
            ans += Math.min(maxLeft, maxRight) - height[i];
        }
        return ans;*/

        //Converted into Dynamic Programming
        int ans = 0;
        int size = height.length;
        if(size < 1) return 0;
        int[] leftMax = new int[size];
        int[] rightMax = new int[size];

        leftMax[0] = height[0];
        rightMax[size-1] = height[size-1];

        for(int i = 1; i< size; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        for(int i = size-2; i >=0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        for(int i = 1; i< size-1; i++) {
            ans += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return ans;
    }
}
