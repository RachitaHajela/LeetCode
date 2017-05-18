package com.edu;

/**
 * Created by RHAJELA on 5/18/2017.
 */
public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        /** using DP, We maintain a boolean table[n][n] that is filled in bottom up manner.
         * The value of table[i][j] is true, if the substring is palindrome, otherwise false.
         * To calculate table[i][j], we first check the value of table[i+1][j-1],
         * if the value is true and str[i] is same as str[j], then we make table[i][j] true.
         * Otherwise, the value of table[i][j] is made false **/
        int len = s.length();
        if (len == 0 || len == 1) return s;
        boolean table[][] = new boolean[len][len];

        //All substring of length 1 are palindrome.
        int maxLen = 1;
        int maxLo = 0;

        for (int i = 0; i < len; i++) {
            table[i][i] = true;
        }

        //check for substring of length 2 :
        for (int i = 0; i < len - 1; i++) {

            if (s.charAt(i) == s.charAt(i + 1)) {
                table[i][i + 1] = true;
                maxLo = i;
                maxLen = 2;
            }
        }

        //check for lengths greater than 2. k is the length of substring.
        for (int k = 3; k <= len; k++) {

            for (int i = 0; i < len - k + 1; i++) {
                int j = i + k - 1;

                if (table[i + 1][j - 1] && s.charAt(i) == s.charAt(j)) {
                    table[i][j] = true;
                    if (k > maxLen) {
                        maxLo = i;
                        maxLen = k;
                    }
                }
            }
        }

        return s.substring(maxLo, maxLen + maxLo);


       /* Simple Sol 1 : brute force solution gives TLE
       int len = s.length();
        if(len == 0 || len == 1) return s;

        int maxLo = 0;
        int maxHi =  0;
        int maxLen = 0;

        for(int i = 0; i<len ; i++) {
            int j = len-1;
            while (i<j) {
                if(isPalindrome(s,i,j)) {
                    if(maxLen < j-i+1) {
                        maxLen = j-i+1;
                        maxLo = i;
                        maxHi = j;
                    }
                }
                j--;
            }
        }
        return s.substring(maxLo,maxHi+1);*/
    }
   /* Method for Sol 1.
   private boolean isPalindrome(String s, int i, int j) {

        while(i<=j) {
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }*/

}
