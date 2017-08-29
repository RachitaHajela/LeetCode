package com.edu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by RHAJELA on 8/29/2017.
 */
public class Subsets2 {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backTrack(nums,result,new ArrayList<Integer>(),0);
        return result;
    }
    public void backTrack(int[] nums, List<List<Integer>> result, List<Integer> path, int pos) {
        result.add(new ArrayList<Integer>(path));

        for(int i = pos; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i-1]) continue;
            path.add(nums[i]);
            backTrack(nums,result,path,i+1);
            path.remove(path.size() -1);
        }
        return;
    }
}
