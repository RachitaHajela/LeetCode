package com.edu;

/**
 * Created by Rachita on 2/19/2017.
 */
public class ThirdMax {

    public static int thirdMax(int[] nums) {
        int size = nums.length;
        long max = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;

       /* Can use this also :
       Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;*/

        for (int num : nums) {
            if (num == max || num == max2) {
                continue;
            }
            if (num > max) {

                max3 = max2;
                max2 = max;
                max = num;

            } else if (num > max2) {

                max3 = max2;
                max2 = num;

            } else if (num >= max3) {
                max3 = num;
            }
        }
        if (max3 != Long.MIN_VALUE) return (int) max3;
        else return (int) max;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, -2147483648};
        System.out.println(thirdMax(nums));

    }
}
