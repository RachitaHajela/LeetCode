package com.edu;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by RHAJELA on 8/11/2016.
 */
public class ValidSudoku {

    boolean isValidSudoku(char[][] board) {
        HashSet<Character> rowSet = new HashSet<Character>();
        HashSet<Character> colSet = new HashSet<Character>();
        HashSet<Character> block = new HashSet<Character>();
        int rowIndex;
        int colIndex;
        //check each column,row and block.

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (board[i][j] != '.' && !rowSet.add(board[i][j])) {
                    return false;
                }
                if (board[j][i] != '.' && !colSet.add(board[j][i])) {
                    return false;
                }
                rowIndex = 3*(i/3);
                colIndex = 3*(i%3);

                if (board[rowIndex + j/3][colIndex + j%3] != '.' && !block.add(board[rowIndex + j/3][colIndex + j%3])) {
                    return false;
                }
            }
            rowSet.clear();
            colSet.clear();
            block.clear();
        }
        return true;
    }
}
