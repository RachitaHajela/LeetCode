package com.edu;

/**
 * Created by rhajela on 4/20/2017.
 */
public class UglyNumber {

    public boolean isUgly(int num) {
        /*
        First solution:
        if(num <= 0) return false;
        while(num>0) {
            if(num%2 == 0) {
                num = num/2;
            }
            else {break;}
        }
        while (num>0) {
            if(num%3 == 0) {
                num = num/3;
            }
            else {break;}
        }
        while (num>0) {
            if(num%5 == 0) {
                num = num/5;
            }
            else {break;}
        }
        if(num>2) return false;
        return true;*/

        /** cleaner solution **/

        if(num <= 0) return false;

        int[] divisors = {2,3,5};

        for(int i : divisors) {
            while(num % i == 0) {
                num = num/i;
            }
        }
        return num == 1;
    }
}
