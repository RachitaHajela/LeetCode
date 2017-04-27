package com.edu;

/**
 * Created by RHAJELA on 4/26/2017.
 */
public class PowerOfFour {

    public static boolean isPowerOfFour(int num) {
        if(num < 1) return false;
        while(num > 1) {
            if(num % 4 != 0) return false;
            num = num/4;
        }
        return true;

        /**** without loops *****/
       /* return (num > 0) && ((num & (num - 1)) == 0) && ((num & 0x55555555) == num);*/
        /*
        * The basic idea is from power of 2, We can use "n&(n-1) == 0" to determine if n is power of 2.
        * For power of 4, the additional restriction is that in binary form, the only "1" should always located at the odd position.
        * For example, 4^0 = 1, 4^1 = 100, 4^2 = 10000. So we can use "num & 0x55555555==num" to check if "1" is located at the odd position.
        *
        * */
    }

    public static void main(String[] args) {
        //System.out.println( (4 % 4));
        System.out.println(isPowerOfFour(1));
    }
}
