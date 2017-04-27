package com.edu;

/**
 * Created by RHAJELA on 4/26/2017.
 */
public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {

       /* if(n<1) return false;
        while(n%2 == 0) {
            n = n/2;
        }
        return n==1;*/


        /*** without using loop **/

        return (n>0 && ((n & n-1) == 0));
    }
}
