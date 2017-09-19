package com.edu;

/**
 * Created by RHAJELA on 9/19/2017.
 */
public class RotateImage {

    public void rotate(int[][] matrix) {
        int n = matrix.length;

        //first transpose
        for(int i = 0; i< n; i++) {
            for(int j = i+1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //then flip the column
        for(int i = 0; i<n; i++) {
            int head = 0;
            int tail = n-1;
            while(head < tail) {
                int temp = matrix[i][head];
                matrix[i][head] = matrix[i][tail];
                matrix[i][tail] = temp;
                head++;
                tail--;
            }
        }
    }
}
