package com.edu;

import java.util.HashSet;

/**
 * Created by RHAJELA on 9/11/2017.
 */
public class SetMismatch {

    public int[] findErrorNums(int[] nums) {

        /* using this instead of set reduces time a lot!!
        int[] arr = new int[nums.length + 1];
        int dup = -1, missing = 1;
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]] += 1;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0)
                missing = i;
            else if (arr[i] == 2)
                dup = i;
        }
        return new int[]{dup, missing};*/


        int[] result = new int[2];
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;

        for(int i = 0; i < n; i++) {
            if(!set.add(nums[i])) {
                result[0] = nums[i];
            }
        }

        for(int i = 1; i <= n; i++) {
            if(!set.remove(i)) {
                result[1] = i;
            }
        }
        return result;
    }
}
