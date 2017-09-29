package com.edu;

/**
 * Created by RHAJELA on 9/29/2017.
 */
public class DistinctSubsequences {

    public int numDistinct(String s, String t) {
        int m = t.length();
        int n = s.length();

        int[][] result = new int[m+1][n+1];

        for(int j =0 ; j<=n ; j++) {
            result[0][j] = 1;
        }

        for(int i = 1; i <= m; i++) {
            for(int j = 1; j<= n; j++) {
                if(t.charAt(i-1) == s.charAt(j-1)) {
                    result[i][j] = result[i][j-1] + result[i-1][j-1];
                }
                else {
                    result[i][j] = result[i][j-1];
                }
            }
        }
        return result[m][n];

    }
}
