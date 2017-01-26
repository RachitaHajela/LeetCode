package com.edu;

/**
 * Created by RHAJELA on 8/3/2016.
 * remove duplicates from sorted array
 */
public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        /*if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;

        int length = nums.length - 1;
        int lenRemaining = nums.length-1;
        int prevValue = nums[0];
        int i = 1;
        int preVal = nums[0];
        int count = 1;
        while (length > 0) {

            if (nums[i] != preVal) {
                preVal = nums[i];
                i++;
                length--;
            } else { // remove from the list.
                for (int k = i; k < lenRemaining; k++) {
                    nums[k] = nums[k + 1];
                }
                length--;
                lenRemaining--;
            }

        }
        return lenRemaining+1;*/
        if (nums.length == 0) return 0;
        int i=0;

         for (int j=1;j<nums.length;j++) {
             if(nums[i] != nums[j]) {
                 i++;
                 nums[i] = nums[j];
             }
         }
    return i+1;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3};
        System.out.println(removeDuplicates(nums));
       // System.out.println(nums[5]);
    }
}
