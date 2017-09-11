package com.edu;

/**
 * Created by RHAJELA on 9/11/2017.
 */
public class ImageSmoother {

    public int[][] imageSmoother(int[][] M) {
        int n = M.length;
        if (n == 0) return M;
        int m = M[0].length;
        int[][] result = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int count = 1;
                int val = M[i][j];

                if (i - 1 >= 0) {
                    val += M[i - 1][j];
                    count++;
                    if (j - 1 >= 0) {
                        val += M[i - 1][j - 1];
                        count++;
                    }
                }
                if (i + 1 < n) {
                    val += M[i + 1][j];
                    count++;

                    if (j + 1 < m) {
                        val += M[i + 1][j + 1];
                        count++;
                    }
                }
                if (j - 1 >= 0) {
                    val += M[i][j - 1];
                    count++;

                    if (i + 1 < n) {
                        val += M[i + 1][j - 1];
                        count++;
                    }
                }
                if (j + 1 < m) {
                    val += M[i][j + 1];
                    count++;
                    if (i - 1 >= 0) {
                        val += M[i - 1][j + 1];
                        count++;
                    }
                }
                result[i][j] = (int)Math.floor(val/count);

            }
        }
        return result;
    }
}
