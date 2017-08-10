package com.edu;

import java.util.HashSet;

/**
 * Created by RHAJELA on 8/10/2017.
 */
public class ContainsDuplicates {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set  = new HashSet<>();

        for(int i = 0; i< nums.length ; i++) {
            if(!set.add(nums[i])) return true;
        }
        return false;
    }
    /** can use sorting also
     * Arrays.sort(nums);
     for (int i = 0; i < nums.length - 1; ++i) {
     if (nums[i] == nums[i + 1]) return true;
     }
     return false;
     */
}
