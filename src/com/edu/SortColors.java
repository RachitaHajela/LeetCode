package com.edu;

/**
 * Created by RHAJELA on 7/27/2017.
 */
public class SortColors {

    public void sortColors(int[] nums) {
        /** one pass solution **/
        int red = 0;
        int blue = nums.length -1;
        int i = 0;
        while(i < nums.length ) {
            if(nums[i] == 0 && i > red) {
                swap(nums,i,red);
                red++;
            }else if (nums[i] == 2 && i < blue) {
                swap(nums,i,blue);
                blue --;
            }
            else {
                i++;
            }
        }

        /* Counting sort solution
        int redCount = 0;
        int whiteCount = 0;
        int blueCount = 0;

        for(int i = 0; i< nums.length; i++) {
            if(nums[i] == 0) {
                redCount++;
            }
            else if(nums[i] == 1) {
                whiteCount++;
            }
            else {
                blueCount++;
            }
        }
        int j = 0;
        while(j < redCount) {
            nums[j] = 0;
            j++;
        }
        while(j < whiteCount) {
            nums[j] = 1;
            j++;
        }
        while(j < blueCount) {
            nums[j] = 2;
            j++;
        }*/
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
