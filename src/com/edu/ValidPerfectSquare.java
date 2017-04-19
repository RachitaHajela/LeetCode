package com.edu;

/**
 * Created by RHAJELA on 3/30/2017.
 */
public class ValidPerfectSquare {

    public static boolean isPerfectSquare(int num) {
        /*int i = 1;
        while (num > 0) {
            num -= i;
            i += 2;
        }
        return num == 0;*/

        /** Binary Search Solution **/
        if (num < 1) return false;
        long left=1, right = num;
        while(left <= right) {
            long mid = left + (right-left)/2;
            long square = mid * mid;
            if(square > num) {
                right = mid-1;
            }
            else if (square < num) {
                left = mid + 1;
            }
            else return true;
        }
        return false;

        /** newton's method **/
        /*if (num < 1) return false;
        long t = num;
        while (t * t > num) {
            t = (t + num / t) / 2;
        }
        return t * t == num;*/

    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(2));
    }
}
