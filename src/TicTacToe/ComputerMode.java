package TicTacToe;


import java.security.SecureRandom;
import java.util.ArrayList;

import static TicTacToe.WinPatterns.playerOneWinPatterns;
import static TicTacToe.WinPatterns.playerTwoWinPatterns;

public class ComputerMode {

    private static String [] players = {Players.getPlayerOne(), Players.getPlayerTwo()};

    private static SecureRandom randomNumber = new SecureRandom();

    private static int computerMove = 1 + randomNumber.nextInt(9);

    public static void setPlayers(int response, int move){

        if (response ==1) playerOnePlaysFirst(move);
        else if (response == 2) computerPlaysFirst(move);
        }


        public static void playerOnePlaysFirst(int move){

            playerMove(move);
            computerMoves();
        }

        public static void computerPlaysFirst(int move){

                computerMoves();
                playerMove(move);
            }

        public static void computerMoves(){

            if (PlayBoard.viewCell(computerMove).equals(" ")) Moves.playerTwoMoves(computerMove);
            PlayBoard.viewBoard();
            if (playerTwoWinPatterns()) {
                System.out.println("Computer Wins");
                System.exit(1);
            } else if (WinPatterns.decideDraw()) {
                System.out.println("It's a Draw!");
                System.exit(1);
            }

        }

        public static void playerMove(int move){

            if (PlayBoard.viewCell(move).equals(" ")) Moves.playerOneMoves(move);
            PlayBoard.viewBoard();
            if (playerOneWinPatterns()) {
                System.out.println("Player One Wins");
                System.exit(1);
            } else if (WinPatterns.decideDraw()) {
                System.out.println("It's a Draw!");
                System.exit(1);
            }


        }


}







