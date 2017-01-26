package com.edu;

/**
 * Created by RHAJELA on 8/22/2016.
 */
public class Search2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i=0;
       if(target < matrix[0][0]) return false;


           while(target > matrix[i][n-1] && i<m-1){
               i++;}
           for(int j=0;j<n;j++) {
                if(target == matrix[i][j]) {return true;} else if(target < matrix[i][j]) {
                    return false;
                }
           }

        return false;

    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1}};

        System.out.println(searchMatrix(matrix,2));
    }
}
