package com.edu;

/**
 * Created by RHAJELA on 4/25/2017.
 */
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        if(nums.length == 0) return 0;

        int low = 0;
        int high = nums.length -1;
        int mid = 0;

        while(low <= high) {
            mid = (high - low)/2 + low;
            if(target == nums[mid]) return mid;
            if(target < nums[mid]) {
                high = mid -1;
            }else {
                low = mid + 1;
            }

        }
        return low;
    }

}
