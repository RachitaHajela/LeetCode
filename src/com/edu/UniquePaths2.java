package com.edu;

/**
 * Created by RHAJELA on 5/18/2017.
 */
public class UniquePaths2 {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int ways[][] = new int[m][n];  //can do changes in obstacle grid if space is limited.

        for(int i = 0 ; i< m ; i++) {
            for(int j = 0; j<n;j++) {
                if(i == 0 && j == 0) {
                    ways[i][j] = 1;
                }
               else if(obstacleGrid[i][j] != 1) {
                   if(i == 0) {
                       ways[i][j] = ways[i][j-1];
                   }
                   else if (j == 0) {
                       ways[i][j] = ways[i-1][j];
                   }
                   else ways[i][j] = ways[i][j-1] + ways[i-1][j];
                }
                else {
                    ways[i][j] = 0;
                }

            }
        }

        return ways[m-1][n-1];
    }
}
