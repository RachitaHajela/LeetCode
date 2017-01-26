package com.edu;

/**
 * Created by RHAJELA on 8/10/2016.
 */
public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int i = 0;
        int last=nums.length;
        while(i<last) {
            if(nums[i]==val) {
                nums[i] = nums[last-1];
                    last--;
            }
            else {
                i++;
            }

        }
        return last;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(removeElement(nums, 3));
    }
}