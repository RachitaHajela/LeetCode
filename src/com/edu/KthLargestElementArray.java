package com.edu;

import java.util.PriorityQueue;

/**
 * Created by RHAJELA on 5/11/2017.
 */
public class KthLargestElementArray {

    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> q = new PriorityQueue<Integer>(k);
        for(int i: nums){
            q.offer(i);

            if(q.size()>k){
                q.poll();
            }
        }

        return q.peek();

        /*return quickSort(0,nums.length-1,nums,nums.length -k);*/
    }

    private int quickSort(int low, int high, int[] nums, int k) {
        int i = low, j = high;
        int mid = low + (high-low)/2;
        int pivot = nums[mid];

        while(i<=j) {

            while(nums[i] < pivot) {
                i++;
            }
            while(nums[j] > pivot) {
                j--;
            }
            if(i<=j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
       // System.out.println("pivot:" + pivot + "; i "+ i+ "; j "+ j);
        if(k == i) return pivot;
        else if ( k > i) {
            return quickSort(i,high,nums,k);
        }
        else return quickSort(low,j,nums,k);
    }
}
