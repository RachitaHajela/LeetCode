package com.edu;

/**
 * Created by RHAJELA on 9/20/2017.
 */
public class SearchA2DMatrixII {

    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length < 1 || matrix[0].length <1) {
            return false;
        }
        //start at top right corner. O(m+n)
        int col = matrix[0].length-1;
        int row = 0;

        while(row < matrix.length && col >= 0) {
            if(matrix[row][col] == target) return true;
            while(col >= 0 && target < matrix[row][col]) {
                col--;
            }
            while(row < matrix.length && col>=0 && target > matrix[row][col]) {
                row++;
            }
        }
        return false;
    }
}
