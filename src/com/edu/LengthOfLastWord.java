package com.edu;

import java.util.StringTokenizer;

/**
 * Created by RHAJELA on 8/16/2016.
 */
public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int length = s.length();
        int lengthIndex = s.length() -1;
        int lastWordLength = 0;

        /* trim the spaces from the end*/
        for (int i = length-1; i>=0 && s.charAt(lengthIndex)==' ';i--) {
            lengthIndex--;
        }
        for(int i=lengthIndex; i>=0 && s.charAt(i) != ' '; i--) {
            lastWordLength++;
        }
        return lastWordLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("a bb   c "));
    }
}
