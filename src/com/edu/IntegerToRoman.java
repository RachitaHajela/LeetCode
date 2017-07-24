package com.edu;

/**
 * Created by rhajela on 6/16/2017.
 */
public class IntegerToRoman {

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder("");
        switch(num) {
            case 1: return "I";
            case 5: return "V";

            case 10: return "X";

            case 50: return "50";

            case 100: return "C";

            case 500: return "D";

            case 1000: return "M";


        }

        return sb.toString();
    }
}
