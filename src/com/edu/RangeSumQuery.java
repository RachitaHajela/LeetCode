package com.edu;

/**
 * Created by RHAJELA on 2/24/2017.
 */
public class RangeSumQuery {

    public static class NumArray {
        int[] nums;
        public NumArray(int[] nums) {
            this.nums = nums;
        }

        public int sumRange(int i, int j) {
            long sum = 0;
            for(int k = i; k<=j; k++) {
                sum = sum + nums[k];
            }
            return (int) sum;
        }
    }
    public static void main(String[] args) {
        int[] num = {-2, 0, 3, -5, 2, -1};
        NumArray obj = new NumArray(num);
        int param_1 = obj.sumRange(0,5);
        System.out.println(param_1);
    }
/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */

}
