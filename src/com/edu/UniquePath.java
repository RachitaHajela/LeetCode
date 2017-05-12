package com.edu;

/**
 * Created by Rachita on 5/11/2017.
 */
public class UniquePath {

    public int uniquePaths(int m, int n) {

        int[][] ways = new int[m][n];
        for (int i = 0; i < m; ++i)
        {
            for (int j = 0; j < n; ++j)
            {
                if(i == 0 && j == 0)
                    ways[i][j] = 1;
                else if(i == 0)
                    ways[i][j] = ways[i][j-1];
                else if(j == 0)
                    ways[i][j] = ways[i-1][j];
                else
                    ways[i][j] = ways[i-1][j] + ways[i][j-1];
            }
        }

        return ways[m-1][n-1];

       /* int[][] paths = new int[m][n];
        if (m == 0 && n == 0) return 0;
        if (m == 0 || n == 0) return 1;
        for (int i = 0; i < m; i++) {
            paths[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            paths[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                paths[i][j] = paths[i][j - 1] + paths[i - 1][j];
            }
        }
        return paths[m - 1][n - 1];*/
    }
}
