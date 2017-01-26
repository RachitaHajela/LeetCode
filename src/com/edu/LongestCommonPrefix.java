package com.edu;

/**
 * Created by RHAJELA on 7/28/2016.
 */
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String shortStr = strs[0];
        int size = strs.length;
        for (int i = 1; i < size; i++) {
            if (shortStr.length() > strs[i].length()) {
                shortStr = strs[i];
            }
        }
        StringBuilder sB = new StringBuilder(shortStr);

        for (int i = 0; i < size; i++) {
            int minLength = sB.length();
            int k = 0;
            for (k = 0; k < minLength; k++) {
                if (sB.charAt(k) != strs[i].charAt(k)) {
                    sB.delete(k, sB.length());
                    break;
                }
            }


        }

        return sB.toString();

    }

    public static void main(String[] args) {
        String car[] = new String[]{"ca", "a"};
        System.out.println(longestCommonPrefix(car));
    }
}
