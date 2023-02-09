package TicTacToe;

public class Moves {



    public static void playerOneMoves(int move){
        if (move == 1) PlayBoard.setBoard(0, 0, Players.getPlayerOne());
        else if (move == 2)PlayBoard.setBoard(0, 1, Players.getPlayerOne());
        else if (move == 3)PlayBoard.setBoard(0,2,Players.getPlayerOne());
        else if (move == 4)PlayBoard.setBoard(1,0, Players.getPlayerOne());
        else if (move == 5)PlayBoard.setBoard(1,1, Players.getPlayerOne());
        else if (move == 6)PlayBoard.setBoard(1,2, Players.getPlayerOne());
        else if (move == 7)PlayBoard.setBoard(2,0,Players.getPlayerOne());
        else if (move == 8)PlayBoard.setBoard(2,1, Players.getPlayerOne());
        else if (move == 9)PlayBoard.setBoard(2,2, Players.getPlayerOne());

    }

    public static void playerTwoMoves(int move){
        if (move == 1) PlayBoard.setBoard(0, 0, Players.getPlayerTwo());
        else if (move == 2)PlayBoard.setBoard(0, 1, Players.getPlayerTwo());
        else if (move == 3)PlayBoard.setBoard(0,2,Players.getPlayerTwo());
        else if (move == 4)PlayBoard.setBoard(1,0, Players.getPlayerTwo());
        else if (move == 5)PlayBoard.setBoard(1,1, Players.getPlayerTwo());
        else if (move == 6)PlayBoard.setBoard(1,2, Players.getPlayerTwo());
        else if (move == 7)PlayBoard.setBoard(2,0,Players.getPlayerTwo());
        else if (move == 8)PlayBoard.setBoard(2,1, Players.getPlayerTwo());
        else if (move == 9)PlayBoard.setBoard(2,2, Players.getPlayerTwo());

    }
}
