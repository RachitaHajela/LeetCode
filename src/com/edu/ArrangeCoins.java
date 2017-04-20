package com.edu;

/**
 * Created by RHAJELA on 3/15/2017.
 */
public class ArrangeCoins {

    public int arrangeCoins(int n) {
        int count = 0;

        while (n >= 0) {
            count++;
            n = n - count;

        }

        return count - 1;

        /* Based on series 1+2+3+4+....+x <= n
         (x)(x+1)/2  <= n

         solve quadratic :
           return (int) ((Math.sqrt(1 + 8.0 * n) - 1) / 2);


           or find x using binary search:

         int start = 0;
        int end = n;
        int mid = 0;
        while (start <= end){
            mid = (start + end) >>> 1;
            if ((0.5 * mid * mid + 0.5 * mid ) <= n){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return start - 1;
         */

    }
}
