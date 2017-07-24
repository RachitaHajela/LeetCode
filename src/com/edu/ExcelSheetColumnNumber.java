package com.edu;

/**
 * Created by RHAJELA on 7/24/2017.
 */
public class ExcelSheetColumnNumber {

    public int titleToNumber(String s) {
        int total = 0;
        int len = s.length();
        for(int i = 0; i < len; i++) {
            total = total + valueOfChar(s.charAt(len - i - 1),i); // or result = result * 26 + (s.charAt(i) - 'A' + 1);
        }
        return total;
    }

    private int valueOfChar(char val, int index) {
        int value = val - 'A' + 1;
        return (int)Math.pow(26,index) * value;
    }
}
