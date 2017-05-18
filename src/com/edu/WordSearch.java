package com.edu;

/**
 * Created by Rachita on 5/17/2017.
 */
public class WordSearch {

    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (checkForNext(board, word, i, j, 0)) return true;
            }
        }

        return false;
    }

    private boolean checkForNext(char[][] board, String word, int i, int j, int k) {
        int m = board.length;
        int n = board[0].length;
        if (i < 0 || j < 0 || i >= m || j >= n)
            return false;

        if (board[i][j] == word.charAt(k)) {
            char temp = board[i][j];
            board[i][j] = '#';
            if (k == word.length() - 1) {
                return true;
            } else if (checkForNext(board, word, i - 1, j, k + 1)
                    || checkForNext(board, word, i + 1, j, k + 1)
                    || checkForNext(board, word, i, j - 1, k + 1)
                    || checkForNext(board, word, i, j + 1, k + 1)) {
                return true;
            }
            board[i][j] = temp;
        }
        return false;
    }
}
