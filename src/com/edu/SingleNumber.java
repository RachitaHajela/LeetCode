package com.edu;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Created by RHAJELA on 5/3/2017.
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {

        /* using XOR
        int res = 0;
    for (int i = 0; i < nums.length; i++) {
        res = res^nums[i];
    }
    return res;

         */

    /* using hashset */
        HashSet<Integer> set = new HashSet<>();
        int size  = nums.length;
        for(int i = 0; i< size; i++) {
            if(!set.remove(nums[i])) {
                set.add(nums[i]);
            }
        }
        if(set.size() < 1) return 0;
        return set.iterator().next();
        /*
        First way :
        HashMap<Integer,Integer> map = new HashMap<>();
        int size = nums.length;
        for(int i=0; i<size; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else {
                map.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                return entry.getKey();
            }
        }
         return 0;
        */

    }
}
