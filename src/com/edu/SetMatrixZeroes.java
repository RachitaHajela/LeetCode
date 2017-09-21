package com.edu;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by RHAJELA on 9/21/2017.
 */
public class SetMatrixZeroes {

    public void setZeroes(int[][] matrix) {
        /** improve upon this by store states of each row in the first of that row,
         * and store states of each column in the first of that column.
         * Because the state of row0 and the state of column0 would occupy the same cell,
         * I let it be the state of row0, and use another variable "col0" for column0. **/
        /*HashSet<Integer> rowSet = new HashSet<>();
        HashSet<Integer> colSet = new HashSet<>();
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rowSet.add(i);
                    colSet.add(j);
                }
            }
        }

        Iterator<Integer> iter = rowSet.iterator();
        while (iter.hasNext()) {
            int rowNum = iter.next();
            for (int j = 0; j < n; j++) {
                matrix[rowNum][j] = 0;
            }
        }
        iter = colSet.iterator();
        while (iter.hasNext()) {
            int colNum = iter.next();
            for (int j = 0; j < m; j++) {
                matrix[j][colNum] = 0;
            }
        }*/

        boolean fr = false, fc = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    if (i == 0) fr = true;
                    if (j == 0) fc = true;
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if (fr) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }
        if (fc) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
