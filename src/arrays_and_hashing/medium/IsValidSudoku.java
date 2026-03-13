package arrays_and_hashing.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class IsValidSudoku {


    public static boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            if (!isValidBlock(board, i, 0, i, 8)) {
                return false;
            }
        }


        for (int j = 0; j < 9; j++) {
            if (!isValidBlock(board, 0, j, 8, j)) {
                return false;
            }
        }


        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                if (!isValidBlock(board, row, col, row + 2, col + 2)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isValidBlock(char[][] board, int startRow, int startCol, int endRow, int endCol) {
        boolean[] seen = new boolean[9];
        for (int i = startRow; i <= endRow; i++) {
            for (int j = startCol; j <= endCol; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1';  
                    if (seen[num]) {
                        return false;
                    }
                    seen[num] = true;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println(isValidSudoku(board)); 
    }
}

