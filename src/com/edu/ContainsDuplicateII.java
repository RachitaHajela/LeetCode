package com.edu;

import java.util.HashMap;

/**
 * Created by Rachita on 3/4/2017.
 */
public class ContainsDuplicateII {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int size = nums.length;
        for(int i = 0; i<size ; i++) {
          if(map.containsKey(nums[i]) && (i - map.get(nums[i]))<=k) {
              return true;
          }  else
          {
              map.put(nums[i],i);
          }
        }
        return false;
        /*** or use Set, sliding window concept, faster ****
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(i > k) set.remove(nums[i-k-1]);
            if(!set.add(nums[i])) return true;
        }
        return false;
         */
    }

    public static void main (String[] args) {

    }
}
