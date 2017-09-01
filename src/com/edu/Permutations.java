package com.edu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RHAJELA on 7/27/2017.
 */
public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permuteHelper(nums,result,0);



        //backTrack(nums,result,new ArrayList<Integer>());
        return result;
    }

    private void permuteHelper(int[] nums, List<List<Integer>> result, int start) {
        if(start >= nums.length) {
            ArrayList<Integer> list = convertToArrayList(nums);
        }

        for(int i = start; i < nums.length; i++) {
            swap(nums,start,i);
            permuteHelper(nums,result,start+1);
            swap(nums,start,i);
        }
    }

    private ArrayList<Integer> convertToArrayList(int[] nums) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        for(int i = 0; i< nums.length; i++) {
            l.add(nums[i]);
        }
        return l;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    //works but might not be ideal solution.
    private void backTrack(int[] nums, List<List<Integer>> result, ArrayList<Integer> path) {
        if(path.size() == nums.length) {
            result.add(path);
        }else {
            for(int i = 0; i<nums.length;i++) {
                if(path.contains(nums[i])) continue;
                path.add(nums[i]);
                backTrack(nums,result, new ArrayList<Integer>(path));
                path.remove(path.size()-1);
            }
        }
    }
}
