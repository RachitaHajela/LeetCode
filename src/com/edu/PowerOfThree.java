package com.edu;

/**
 * Created by RHAJELA on 4/26/2017.
 */
public class PowerOfThree {

        public boolean isPowerOfThree(int n) {
            /*if (n < 1) return false;
            while(n%3 == 0) {
                n = n/3;
            }
            return n==1;*/

            //Base change
           return Integer.toString(n,3).matches("^10*$");

        }
}
