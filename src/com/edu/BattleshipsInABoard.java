package com.edu;

/**
 * Created by RHAJELA on 7/26/2017.
 */
public class BattleshipsInABoard {

    public int countBattleships(char[][] board) {

        /** For memory(1) one pass
         * === Count # of starting points.
         * Starting point is X where left and up are empty.
         */

        /** other solution **/

        int count = 0;
        int n = board.length;
        int m = board[0].length;
        int i = 0, j=0;
        while(i<n) {
            j= 0;
            while(j < m) {
                if(board[i][j] == 'X') {
                    count++;
                    board = flagHorizontalOrVertical(board,i,j);
                }
                j++;
            }
            i++;
        }
        return count;
    }

    private char[][] flagHorizontalOrVertical(char[][] board, int i, int j) {
        int n = board.length;
        int m = board[0].length;
        board[i][j] = '1';
        if(i< n-1 && board[i+1][j] == 'X') //vertical battleship
        {
           while(i< n-1 && board[i+1][j] == 'X') {
               i++;
               board[i][j] = '1';
           }
        }
        else {
            while(j < m-1 && board[i][j+1] == 'X') {
                j++;
                board[i][j] = '1';
            }
        }
        return board;
    }
}
