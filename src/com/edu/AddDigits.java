package com.edu;

/**
 * Created by RHAJELA on 7/26/2017.
 */
public class AddDigits {

    public int addDigits(int num) {
        /**
         * one line method. If number is divisible by 9 return 9. Else return num % 9
         */

        return (num < 10) ? num : num % 9 == 0 ? 9 : num % 9;

       /* General method.
       while(num / 10 > 0) {
            num = addDigitsHelper(num);
        }
        return num;*/
    }

    private int addDigitsHelper(int num) {
        int sum = 0;
        while(num > 0) {
            sum = sum + num % 10;
            num = num /10;
        }
        return sum;
    }
}
