package com.edu;

/**
 * Created by RHAJELA on 8/11/2017.
 */
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] prod = new int[n];

        left[0] = 1;
        right[n-1] = 1;

        //construct left array
        for(int i = 1; i<n; i++) {
            left[i] = left[i-1] * nums[i-1];
        }

        //construct the right array
        for(int j = n-2; j >= 0; j++) {
            right[j] = right[j+1] * nums[j+1];
        }

        //construct product array
        for(int i = 0; i< n; i++) {
            prod[i] = left[i] * right[i];
        }
        return prod;
    }
}
