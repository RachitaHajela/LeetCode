package com.edu;

import java.util.HashMap;

/**
 * Created by RHAJELA on 9/13/2017.
 */
public class TwoSum2 {

    public int[] twoSum(int[] numbers, int target) {

        int low = 0, high = numbers.length - 1;
        while(low < high) {
            int  sum = numbers[low] + numbers[high];
            if(target == sum) {
                return new int[]{low+1,high+1};
            }
            if(sum > target) {
                high--;
            }
            else {
                low++;
            }

        }
        return new int[]{-1,-1};

        /* Does not use property of sorted array
        int[] result = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i< numbers.length ; i++) {
            if(map.containsKey(target-numbers[i])) {
                result[0] = map.get(target-numbers[i]);
                result[1] = i+1;
                return result;
            }
            else {
                map.put(numbers[i],i+1);
            }
        }
        return result;*/

    }
}
