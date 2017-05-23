package com.edu;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by RHAJELA on 5/19/2017.
 */
public class ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target) {
        int min = Integer.MAX_VALUE;
        int size = nums.length;
        Arrays.sort(nums);
        int result = 0;

        for (int i = 0; i<size ; i++) {
            int lo = i+1;
            int hi = size-1;

            while(lo<hi) {
                int sum = nums[i] + nums[lo] + nums[hi];
                int diff = Math.abs(sum-target);

                if(diff == 0) return sum;
                if(diff < min) {
                    min = diff;
                    result = sum;
                }
                if(sum <= target) {
                    lo++;
                } else {
                    hi--;
                }
            }
        }

        return result;
    }
}
