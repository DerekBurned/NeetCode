package arrays_and_hashing.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class IsValidSudoku {
    public static void main(String[] args) {

    }
    public static boolean isValidSudoku(char[][] board){
        Map<Character, Integer> map = new HashMap<>();
        IntStream.range(0, board.length)
                .forEach(i -> IntStream.range(0, board[i].length)
                        .forEach(j -> map.put(board[i][j], i * board[i].length + j)));




        return false;
    }
}
