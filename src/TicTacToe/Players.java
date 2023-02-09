package TicTacToe;

public class Players {
    private static String playerOne = CellValue.X.printValue();
    private static String playerTwo = CellValue.O.printValue();


    public static String getPlayerOne() {
        return playerOne;
    }

    public static String getPlayerTwo() {
        return playerTwo;
    }
}


