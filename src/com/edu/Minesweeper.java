package com.edu;

/**
 * Created by RHAJELA on 10/3/2017.
 */
public class Minesweeper {

    private static int[][] directions = new int[][]{{-1, -1}, {-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}};

    public char[][] updateBoard(char[][] board, int[] click) {

        int i = click[0];
        int j = click[1];

        if (board[i][j] == 'M') {
            board[i][j] = 'X';
        } else if (board[i][j] == 'E') {
            updateBlank(board, i, j, board.length, board[0].length);
        }

        return board;
    }

    private void updateBlank(char[][] board, int i, int j, int m, int n) {
        //if(i < 0 || j <0 || i >=m || j >= n) return;
        //if(board[i][j] != 'E') return;

        int countAdjacentMines = 0;

        for (int[] k : directions) {
            int kx = i + k[0];
            int ky = j + k[1];
            countAdjacentMines += checkMine(board, kx, ky, m, n);
        }
        //System.out.println("count mine:"+countAdjacentMines);
        if (countAdjacentMines > 0) {
            board[i][j] = (char) (countAdjacentMines + '0');
        } else {
            board[i][j] = 'B';
            for (int[] k : directions) {
                int kx = i + k[0];
                int ky = j + k[1];
                if (kx < 0 || ky < 0 || kx >= m || ky >= n || board[kx][ky] != 'E') continue;
                updateBlank(board, kx, ky, m, n);
            }
        }

    }

    private int checkMine(char[][] board, int i, int j, int m, int n) {
        if (i < 0 || j < 0 || i >= m || j >= n) return 0;
        if (board[i][j] == 'M') return 1;
        return 0;
    }
}
