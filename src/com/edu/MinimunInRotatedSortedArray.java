package com.edu;

/**
 * Created by RHAJELA on 7/26/2017.
 */
public class MinimunInRotatedSortedArray {

    public int findMin(int[] nums) {
        int low = 0;
        int high =  nums.length-1;
        int mid;
        while(low < high) {
            if(nums[low] < nums[high])
                return nums[low];
            mid = low + (high - low)/2;
            if(nums[mid] > nums [high]) {
                low = mid + 1;
            }
            else if (nums[mid] < nums[low]) {
                high = mid;
            }
        }
        return nums[low];
    }

}
