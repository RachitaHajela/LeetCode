package com.edu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RHAJELA on 8/29/2017.
 */
public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List <Integer>> result = new ArrayList<>();
        dfsHelper(nums,result,new ArrayList<Integer>(),0);
        return result;
    }

    private void dfsHelper(int[] nums, List<List<Integer>> result, ArrayList<Integer> each, int pos) {
        if(pos <= nums.length) {
            //System.out.println(each.toString());
            result.add(each);
        }

        for(int i = pos; i< nums.length; i++) {
            each.add(nums[i]);
            dfsHelper(nums,result,new ArrayList<Integer>(each),i+1);
            each.remove(each.size()-1);
        }
        return;
    }
}
