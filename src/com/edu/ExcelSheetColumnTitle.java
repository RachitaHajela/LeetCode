package com.edu;

/**
 * Created by RHAJELA on 2/21/2017.
 */
public class ExcelSheetColumnTitle {

    public static String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        int count = 64;

        while (n > 0) {
            int numToConvert = n % 26;
            if (numToConvert == 0) {
                sb.insert(0, 'Z');
            } else sb.insert(0, (char) (numToConvert + count));

            n = --n / 26;

        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(51));
    }
}
