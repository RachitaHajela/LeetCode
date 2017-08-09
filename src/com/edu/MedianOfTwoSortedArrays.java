package com.edu;

/**
 * Created by RHAJELA on 8/8/2017.
 */
public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total = nums1.length + nums2.length;
    }

    private int findKth(int A[], int B[], int k, int aStart, int aEnd, int bStart, int bEnd) {
        int aLen = aEnd - aStart +1;
        int bLen = bEnd - bStart +1;

        if(aLen == 0) {
            return B[bStart + k];
        }
        if(bLen == 0) {
            return  A[aStart + k];
        }
        if(k == 0) {
            return A[aStart] < B[bStart] ? A[aStart] : B[bStart];
        }

    }
}
