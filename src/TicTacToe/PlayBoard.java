package TicTacToe;

import java.util.ArrayList;
import java.util.Arrays;

import static TicTacToe.CellValue.EMPTY;

public class PlayBoard {
    private static String[][] board = new String[3][3];

    public PlayBoard() {
        for (int i = 0; i < board.length; i++) {
    for (int j = 0; j < board[0].length; j++) {
                board[i][j] = " ";
}
        }
    }
    public static String viewCell(int number) {
        String value = null;
        if (number == 1) value = board[0][0];
        else if (number == 2) value = board[0][1];
        else if (number == 3) value = board[0][2];
        else if (number == 4) value = board[1][0];
        else  if (number == 5) value = board[1][1];
        else if (number == 6) value = board[1][2];
        else if (number == 7) value = board[2][0];
        else if ( number == 8) value = board[2][1];
        else if (number == 9) value = board[2][2];
        return value;
        }

    public static void setBoard(int row, int column, String value){
         board[row][column] = value;
    }

    public static void viewBoard() {
        for (int i = 0; i < board.length; i++) {
            System.out.println(Arrays.deepToString(board[i]));
            System.out.println();
            }

        }

    public static String [][] getBoard(){
        return board;
    }
}
