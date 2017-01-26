package com.edu;

/**
 * Created by RHAJELA on 8/16/2016.
 */
public class PlusOne {
    public static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + 1 > 9) {
                digits[i] = 0;
            } else {
                digits[i] = digits[i] + 1;
                return digits;
            }
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int[] digits = new int[]{7};
        int[] res = plusOne(digits);

        for (int i : res) {
            System.out.print(i);
        }
    }
}
