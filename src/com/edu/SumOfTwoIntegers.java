package com.edu;

/**
 * Created by RHAJELA on 8/7/2017.
 */
public class SumOfTwoIntegers {
    public int getSum(int a, int b) {
        int carry;
        while(b != 0) {
            carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}
