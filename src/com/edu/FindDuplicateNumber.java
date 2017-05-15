package com.edu;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by RHAJELA on 5/12/2017.
 */
public class FindDuplicateNumber {

    public int findDuplicate(int[] nums) {

        /** using Binary Search **/
        if (nums.length == 0 || nums == null)
            return 0;
        int low = 1, high = nums.length - 1, mid;
        while (low < high) {
            mid = low + (high - low) / 2;
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= mid)
                    count++;
            }
            if (count > mid)
                high = mid;
            else
                low = mid + 1;
        }
        return low;

        /* First Solution :
        Arrays.sort(nums);
        for(int i = 0, j =1 ; j<nums.length; i++,j++ ) {
            if(nums[i] == nums[j]) return nums[i];
        }
        return 0;*/


    }
}
