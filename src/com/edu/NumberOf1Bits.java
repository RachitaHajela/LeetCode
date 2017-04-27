package com.edu;

/**
 * Created by rhajela on 4/20/2017.
 */
public class NumberOf1Bits {

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int mask = 1;
        int count = 0;
        for(int i=0; i<32; i++) {
            if((n & mask) != 0)
                count++;

            mask = mask << 1;
        }

        return count;
        //return Integer.bitCount(n);

    }
}
