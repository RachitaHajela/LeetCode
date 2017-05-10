package com.edu;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by RHAJELA on 5/10/2017.
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {

        /** using bit manipulation: considering n ^ n = 0 and  n ^ 0 = n
         * or
         *
         *  look at the difference between the sum([1,n]) = n * (n+1) / 2 and the sum of nums in our array.
         */
        int size = nums.length;
        int result = 0;
        for(int  i = 1; i<= size; i++) {
            result = result ^ nums[i-1];
            result = result ^ i;
        }
        return result;
        /* First Solution

        HashSet<Integer> set = new HashSet<>();
        int size = nums.length;
        for(int i = 0; i<=size; i++) {
            set.add(i);
        }

        for(int i = 0; i<size; i++) {
            set.remove(nums[i]);
        }
        Iterator<Integer> it = set.iterator();
        return it.next();*/
    }
}
