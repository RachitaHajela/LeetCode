package com.edu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Rachita on 10/9/2017.
 */
public class NumberOfDistinctIslands {
    ArrayList<Integer> shape;

    public int numDistinctIslands(int[][] grid) {
        int count = 0;
        Set shapes = new HashSet<ArrayList<Integer>>();
        int n = grid.length;
        int m = grid[0].length;

        for(int i = 0; i< n; i++) {
            for (int j = 0; j< m; j++) {

                if(grid[i][j] == 1) {
                    count++;
                    shape = new ArrayList<>();
                    expandAround(i,j,grid,n,m,0);
                    if(!shape.isEmpty()) {
                        shapes.add(shape);
                    }
                    // System.out.println(grid[i][j]);
                }
            }
        }

        return shapes.size();
    }

    private void expandAround(int i, int j, int[][] grid, int n, int m,int di) {
        grid[i][j] = 'C';
        shape.add(di);
        //one above
        if(i-1 >= 0 && grid[i-1][j] == 1) {
            expandAround(i-1,j,grid,n,m,1);
        }
        //one below
        if(i+1 < n && grid[i+1][j] == 1) {
            expandAround(i+1,j,grid,i,j,2);
        }
        // one left
        if(j-1 >= 0 && grid[i][j-1] == 1) {
            expandAround(i,j-1,grid,n,m,3);
        }
        //one right
        if(j+1 < m && grid[i][j+1] == 1) {
            expandAround(i,j+1,grid,n,m,4);
        }
        shape.add(0);
    }
}
