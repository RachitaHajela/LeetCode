package com.edu;

import java.util.HashMap;

/**
 * Created by RHAJELA on 5/24/2017.
 */
public class NextGreaterElement1 {
        /** check other solutions also. Have not checked other solutions. **/
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        int[] result = new int[findNums.length];

        int lenBig = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i< lenBig; i++) {
            map.put(nums[i],i);
        }
        int lenSmall = findNums.length;
        for(int i=0; i< lenSmall; i++) {
            int index = map.get(findNums[i]);
            for(int j = index + 1; j<lenBig ; j++) {
                if(nums[j] > findNums[i]) {
                    result[i] = nums[j];
                    break;
                }
                result[i] = -1;
            }
        }
        return result;
    }
}
