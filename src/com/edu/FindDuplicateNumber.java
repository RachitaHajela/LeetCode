package com.edu;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by RHAJELA on 5/12/2017.
 */
public class FindDuplicateNumber {

    public int findDuplicate(int[] nums) {
        

        Arrays.sort(nums);
        for(int i = 0, j =1 ; j<nums.length; i++,j++ ) {
            if(nums[i] == nums[j]) return nums[i];
        }
        return 0;
        /*int n = nums.length -1;
        long sum = n * (n+1) /2;
        int size = nums.length;
        long sumArr = 0;
        for(int i = 0 ; i< size; i++) {
            sumArr += nums[i];
        }
        int diff = (int) (sumArr - sum);
        return diff;*/

    }
}
