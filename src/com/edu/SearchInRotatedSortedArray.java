package com.edu;

/**
 * Created by RHAJELA on 5/19/2017.
 */
public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid])
                return mid;

            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;



        /* FInd pivot and binary search in both the arrays.
        if(nums.length == 0) return -1;
        int lo = 0;
        int hi = nums.length-1;
        int pivot = 0;
        while(nums[lo] > nums [hi]) {
            int mid = lo + (hi - lo)/2;
            if(nums[mid] > nums[hi]) {
                lo = mid + 1;
            }
            else {
                hi = mid;
            }
        }

        System.out.println("pivot :"+lo);
        int res = binarySearch(nums,target,lo,nums.length-1);
        if(res == -1) {
            return binarySearch(nums,target,0,lo-1);
        }else return res;*/

    }

    private int binarySearch(int[] nums, int target, int lo, int hi) {
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (target == nums[mid]) return mid;

            if (target < nums[mid]) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return -1;
    }
}
