package com.edu;

/**
 * Created by RHAJELA on 8/22/2017.
 */
public class NumberOfIslands {

    public int numIslands(char[][] grid) {
        int count = 0;
        
        int n = grid.length;
        int m = grid[0].length;
        
        for(int i = 0; i< n; i++) {
            for (int j = 0; j< m; j++) {
                if(grid[i][j] == '1') {
                    count++;
                    expandAround(i,j,grid,n,m);
                    System.out.println(grid[i][j]);
                }
            }
        }
        
        return count;
    }

    private void expandAround(int i, int j, char[][] grid, int n, int m) {
        grid[i][j] = 'C';
        //one above
        if(i-1 >= 0 && grid[i-1][j] == '1') {
            expandAround(i-1,j,grid,n,m);
        }
        //one below
        if(i+1 < n && grid[i+1][j] == '1') {
            expandAround(i+1,j,grid,i,j);
        }
        // one left
        if(j-1 >= 0 && grid[i][j-1] == '1') {
            expandAround(i,j-1,grid,n,m);
        }
        //one right
        if(j+1 < m && grid[i][j+1] == '1') {
            expandAround(i,j+1,grid,n,m);
        }
    }
}
