package com.edu;

/**
 * Created by Rachita on 2/19/2017.
 */
public class Sqrt {
    public static int mySqrt(int x) {
/*     brute force type method
        if(x==0 || x==1) return x;
        int i = 1;
        int res = 1;
        while (res <  x) {
            i++;
            res = i * i;
            if (res == x) {return i;}
        }
        return --i;*/

        /** using Binary Search **/

        if (x == 0 || x == 1) return x;
        int start = 1;
        int end = x;
        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (mid <= x/mid) {   //use this to prevent Integer Overflow.
                start = mid + 1;
                ans = mid;
            }
            else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Math.sqrt(2147483647));
        System.out.println(mySqrt(2147483646));
    }
}
