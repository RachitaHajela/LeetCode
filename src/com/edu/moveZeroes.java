package com.edu;

/**
 * Created by RHAJELA on 5/8/2017.
 */
public class moveZeroes {

    public void moveZeroes(int[] nums) {
        int size = nums.length;
        int current = 0;

        for (int i = 0; i < size; ++i)
            if (nums[i] != 0)
                nums[current++] = nums[i];

        for (int i = current; i < size; ++i)
            nums[i] = 0;


        /*
        First Solution.

        int size = nums.length;
        for(int i = 0;  i<size; i++) {
            if(nums[i] == 0) {

                int j = i+1;
                while(j<size) {
                    if(nums[j] != 0) {
                        nums[i] = nums[j];
                        nums[j] = 0;
                        break;
                    }
                    j++;
                }
            }
        }*/


    }
}
