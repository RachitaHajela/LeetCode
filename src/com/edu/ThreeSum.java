package com.edu;

import java.util.*;

/**
 * Created by Rachita on 5/15/2017.
 */
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int size = nums.length;
        Arrays.sort(nums);
        if (size < 3) return result;
        for (int i = 0; i < size - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int lo = i + 1, hi = size - 1;
            int target = -nums[i];
            while (lo < hi) {
                if (nums[hi] + nums[lo] == target) {
                    result.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                    lo++;
                    hi--;
                    while (lo < hi && nums[lo] == nums[lo - 1]) lo++;
                    while (lo < hi && nums[hi] == nums[hi + 1]) hi--;
                } else if (nums[lo] + nums[hi] > target) {
                    hi--;
                } else {
                    lo++;
                }
            }
        }
        return result;
    }
}
