package TicTacToeTests;

import TicTacToe.Moves;
import TicTacToe.PlayBoard;
import TicTacToe.Players;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayboardTests {


    @Test
    public void checkThatAllCellsAreInitializedToEmpty() {
        PlayBoard board = new PlayBoard();
        assertEquals("EMPTY", board.viewCell(1));
    }
    @Test
    public void checkThatMovesCanBeMade(){
        PlayBoard board = new PlayBoard();
        Moves move = new Moves();
        Players players = new Players();
        move.playerOneMoves(1);
        move.playerTwoMoves(2);
        move.playerOneMoves(9);
        move.playerTwoMoves(5);
        board.viewBoard();
        //  assertEquals("X", board.viewCell(0, 0));

    }



    }


