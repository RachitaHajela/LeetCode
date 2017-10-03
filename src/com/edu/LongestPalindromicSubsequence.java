package com.edu;

/**
 * Created by Rachita on 10/1/2017.
 */
public class LongestPalindromicSubsequence {

    public int longestPalindromeSubseq(String s) {

        if (s.length() == 0) return 0;
        int[][] matrix = new int[s.length()][s.length()];
        int n = s.length();
        //subseq of Length 1;
        for (int i = 0; i < n; i++) {
            matrix[i][i] = 1;
        }

        for (int k = 1; k < n; k++) {

            for (int i = 0; i < n - k; i++) {
                int j = i + k;
                if (s.charAt(i) == s.charAt(j)) {
                    matrix[i][j] = 2 + matrix[i + 1][j - 1];
                } else {
                    matrix[i][j] = Math.max(matrix[i][j - 1], matrix[i + 1][j]);
                }
            }

        }

        return matrix[0][n - 1];

    }
}
