package com.edu;

/**
 * Created by RHAJELA on 2/21/2017.
 */
public class RotateArray {

    public static void rotate(int[] nums, int k) {

        /*
        Cloning the whole array.
        int[] oldNums = nums.clone();
        for(int i = 0; i< nums.length;i++){
            nums[(i+k)%nums.length] = oldNums[i];
        }*/


        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        int temp;
        while (start <= end) {
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

    }

    public static void main(String[] args) {
        int nums[] = {-1};
        rotate(nums, 2);
        for (int i : nums) {
            System.out.print(i + ", ");
        }

    }
}
