package com.edu;

import java.util.HashMap;

/**
 * Created by RHAJELA on 8/9/2017.
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {

        /** sort and get nums.length/2
         * Arrays.sort(nums);
         return nums[nums.length/2];
         */

        /**
         * moore voting algorithm:
         * int count = 0;
         int result = 0;
         for(int num : nums) {
         if(count == 0) {
         result = num;
         }
         if(num != result) {
         count --;
         }
         else {
         count++;
         }
         }
         return result;
         */





        /** takes most time **/
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<n; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i],1);
            }
            else {
                if(map.get(nums[i])+1 >= n /2) return nums[i];
                map.put(nums[i], map.get(nums[i])+1);
            }
        }
        return 0;
    }
}
