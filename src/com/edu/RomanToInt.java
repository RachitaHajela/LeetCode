package com.edu;

/**
 * Created by RHAJELA on 7/28/2016.
 */
public class RomanToInt {
    public static int romanToInt(String s) {
        int valCurr = 0;
        int valPrev = 0;
        int value = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'i':
                case 'I':
                    valCurr = 1;
                    break;
                case 'v':
                case 'V':
                    valCurr = 5;
                    break;
                case 'x':
                case 'X':
                    valCurr = 10;
                    break;
                case 'l':
                case 'L':
                    valCurr = 50;
                    break;
                case 'c':
                case 'C':
                    valCurr = 100;
                    break;
                case 'd':
                case 'D':
                    valCurr = 500;
                    break;
                case 'm':
                case 'M':
                    valCurr = 1000;
            }
            if (valCurr < valPrev) {
                value = value - valCurr;
            } else {
                value = value + valCurr;
            }
            valPrev = valCurr;
        }
        return value;
    }

    public static void main(String[] args) {

        System.out.println(romanToInt("CCCXCIX"));

    }
}
