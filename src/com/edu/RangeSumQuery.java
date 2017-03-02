package com.edu;

/**
 * Created by RHAJELA on 2/24/2017.
 */
public class RangeSumQuery {

    public static class NumArray {
        int[] sums;

        public NumArray(int[] nums) {

            sums = new int[nums.length+1];
            sums[0] = 0;
            for (int k = 1; k<=nums.length; k++) {
                sums[k]  = sums[k-1] + nums[k-1];
            }
        }

        public int sumRange(int i, int j) {
            return (sums[j+1] - sums[i]);
        }
    }
    public static void main(String[] args) {
        int[] num = {-2, 0, 3, -5, 2, -1};
        NumArray obj = new NumArray(num);
        int param_1 = obj.sumRange(0,4);
        System.out.println(param_1);
    }
/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */

}
