package com.edu;

/**
 * Created by RHAJELA on 8/1/2017.
 */
public class JumpGame {

    public boolean canJump(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max < i) return false;
            max = Math.max(max, i + nums[i]);

        }
        return true;

        /* if(nums.length < 1) return false;
        boolean[] canReach = new boolean[nums.length];
        canReach[0] = true;

        int i = 0;
        while(i < nums.length-1 && canReach[i] && !canReach[nums.length-1]) {
            int jumps = nums[i];

            int j = i+1;

            while(j <= i+jumps && j < nums.length) {
                canReach[j] = true;
                j++;
            }


            i++;
        }

        return canReach[nums.length-1]; */
    }
}
