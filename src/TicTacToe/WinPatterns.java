package TicTacToe;

public class WinPatterns {

    public static boolean playerOneWinPatterns(){

        boolean oneTwoThreePattern = PlayBoard.getBoard()[0][0].equalsIgnoreCase("X") &&
                PlayBoard.getBoard()[0][1].equalsIgnoreCase("X") && PlayBoard.getBoard()[0][2].equalsIgnoreCase("X");

        boolean fourFiveSixPattern = PlayBoard.getBoard()[1][0].equalsIgnoreCase("X") &&
                PlayBoard.getBoard()[1][1].equalsIgnoreCase("X") && PlayBoard.getBoard()[1][2].equalsIgnoreCase("X");

        boolean sevenEightNinePattern = PlayBoard.getBoard()[2][0].equalsIgnoreCase("X") &&
                PlayBoard.getBoard()[2][1].equalsIgnoreCase("X") && PlayBoard.getBoard()[2][2].equalsIgnoreCase("X");

        boolean oneFourSevenPattern = PlayBoard.getBoard()[0][0].equalsIgnoreCase("X") &&
                PlayBoard.getBoard()[1][0].equalsIgnoreCase("X") && PlayBoard.getBoard()[2][0].equalsIgnoreCase("X");

        boolean twoFiveEightPattern = PlayBoard.getBoard()[0][1].equalsIgnoreCase("X") &&
                PlayBoard.getBoard()[1][1].equalsIgnoreCase("X") && PlayBoard.getBoard()[2][1].equalsIgnoreCase("X");

        boolean threeSixNinePattern = PlayBoard.getBoard()[0][2].equalsIgnoreCase("X") &&
                PlayBoard.getBoard()[1][2].equalsIgnoreCase("X") && PlayBoard.getBoard()[2][2].equalsIgnoreCase("X");

        boolean oneFiveNinePattern = PlayBoard.getBoard()[0][0].equalsIgnoreCase("X") &&
                PlayBoard.getBoard()[1][1].equalsIgnoreCase("X") && PlayBoard.getBoard()[2][2].equalsIgnoreCase("X");

        boolean threeFiveSevenPattern = PlayBoard.getBoard()[0][2].equalsIgnoreCase("X") &&
                PlayBoard.getBoard()[1][1].equalsIgnoreCase("X") && PlayBoard.getBoard()[2][0].equalsIgnoreCase("X");

        boolean winPlayerOne = oneTwoThreePattern || fourFiveSixPattern || sevenEightNinePattern || oneFourSevenPattern || twoFiveEightPattern
                || threeSixNinePattern || oneFiveNinePattern || threeFiveSevenPattern;

        if (winPlayerOne) return true;

        return false;
    }

    public static boolean playerTwoWinPatterns(){

        boolean oneTwoThreePattern = PlayBoard.getBoard()[0][0].equalsIgnoreCase("O") &&
                PlayBoard.getBoard()[0][1].equalsIgnoreCase("O") && PlayBoard.getBoard()[0][2].equalsIgnoreCase("O");

        boolean fourFiveSixPattern = PlayBoard.getBoard()[1][0].equalsIgnoreCase("O") &&
                PlayBoard.getBoard()[1][1].equalsIgnoreCase("O") && PlayBoard.getBoard()[1][2].equalsIgnoreCase("O");

        boolean sevenEightNinePattern = PlayBoard.getBoard()[2][0].equalsIgnoreCase("O") &&
                PlayBoard.getBoard()[2][1].equalsIgnoreCase("O") && PlayBoard.getBoard()[2][2].equalsIgnoreCase("O");

        boolean oneFourSevenPattern = PlayBoard.getBoard()[0][0].equalsIgnoreCase("O") &&
                PlayBoard.getBoard()[1][0].equalsIgnoreCase("O") && PlayBoard.getBoard()[2][0].equalsIgnoreCase("O");

        boolean twoFiveEightPattern = PlayBoard.getBoard()[0][1].equalsIgnoreCase("O") &&
                PlayBoard.getBoard()[1][1].equalsIgnoreCase("O") && PlayBoard.getBoard()[2][1].equalsIgnoreCase("O");

        boolean threeSixNinePattern = PlayBoard.getBoard()[0][2].equalsIgnoreCase("O") &&
                PlayBoard.getBoard()[1][2].equalsIgnoreCase("O") && PlayBoard.getBoard()[2][2].equalsIgnoreCase("O");

        boolean oneFiveNinePattern = PlayBoard.getBoard()[0][0].equalsIgnoreCase("O") &&
                PlayBoard.getBoard()[1][1].equalsIgnoreCase("O") && PlayBoard.getBoard()[2][2].equalsIgnoreCase("O");

        boolean threeFiveSevenPattern = PlayBoard.getBoard()[0][2].equalsIgnoreCase("O") &&
                PlayBoard.getBoard()[1][1].equalsIgnoreCase("O") && PlayBoard.getBoard()[2][0].equalsIgnoreCase("O");

        boolean winPlayerTwo = oneTwoThreePattern || fourFiveSixPattern || sevenEightNinePattern || oneFourSevenPattern || twoFiveEightPattern
                || threeSixNinePattern || oneFiveNinePattern || threeFiveSevenPattern;

        if (winPlayerTwo) return true;

        return false;
    }


    public static boolean decideDraw(){

        for (int i = 0; i < PlayBoard.getBoard().length; i++) {
            for (int j = 0; j < PlayBoard.getBoard()[i].length; j++) {
                if (PlayBoard.getBoard()[i][j].equalsIgnoreCase(" ")) return false;
            }
        }
        return true;
    }



}
