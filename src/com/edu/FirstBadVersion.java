package com.edu;

import java.util.Random;

/**
 * Created by RHAJELA on 2/21/2017.
 */
public class FirstBadVersion {

    public static int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (isBadVersion(mid)) {
                if (!isBadVersion(mid - 1)) {
                    return mid;
                } else {
                    end = mid - 1;
                }
            } else {
                start = mid + 1;
            }
        }
        return 0;
    }

    private static boolean isBadVersion(int version) {
        int value = 1;
        if (version >= value) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {

        System.out.print("First bad Version: " + firstBadVersion(1));

    }

}
