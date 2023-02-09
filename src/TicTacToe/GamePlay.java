package TicTacToe;

import java.security.SecureRandom;
import java.util.Scanner;

import static TicTacToe.WinPatterns.playerOneWinPatterns;
import static TicTacToe.WinPatterns.playerTwoWinPatterns;

public class GamePlay {
    private static PlayBoard board = new PlayBoard();
    private static Moves move = new Moves();
    private static Players players = new Players();
    private static WinPatterns winPatterns = new WinPatterns();
    private static Scanner scanner = new Scanner(System.in);

    private static SecureRandom random = new SecureRandom();


    public static void main(String[] args) throws InterruptedException {
       // multiPlayerMode();
       computerMode();

    }

    public static void display(String prompt) {
        System.out.println(prompt);
    }

    public static String input(String prompt) {
        display(prompt);
        return scanner.nextLine();
    }


    public static void playerOneSetup() {
        int move = Integer.parseInt(input("Player One. Enter a Number between 1 and 9 to take a position"));
        if (PlayBoard.viewCell(move).equals(" ")) Moves.playerOneMoves(move);
        board.viewBoard();
        if (playerOneWinPatterns()) {
            display("Player One Wins");
            System.exit(1);
        } else if (WinPatterns.decideDraw()) {
            display("It's a Draw!");
            System.exit(1);
        }

    }

    public static void playerTwoSetup() {
        int move = Integer.parseInt(input("Player Two. Enter a Number between 1 and 9 to take a position"));
        if (PlayBoard.viewCell(move).equals(" ")) Moves.playerTwoMoves(move);
        board.viewBoard();
        if (playerTwoWinPatterns()) {
            display("Player Two Wins");
            System.exit(1);
        } else if (WinPatterns.decideDraw()) {
            display("It's a Draw!");
            System.exit(1);
        }

    }

    public static void multiPlayerMode() {
        while ((playerOneWinPatterns() == false) || (playerTwoWinPatterns() == false)) {
            playerOneSetup();
            playerTwoSetup();
        }
    }

    public static void computerPlay(){
        int move = 1 + random.nextInt(9);
        System.out.println(move);
        if (PlayBoard.viewCell(move).equals(" ")) Moves.playerTwoMoves(move);
        board.viewBoard();
        if (playerTwoWinPatterns()) {
            display("Player Two Wins");
            System.exit(1);
        } else if (WinPatterns.decideDraw()) {
            display("It's a Draw!");
            System.exit(1);
        }


    }

    public static void computerMode() throws InterruptedException {
        while ((playerOneWinPatterns() == false) || (playerTwoWinPatterns() == false)) {
            computerPlay();
            Thread.sleep(3000);
      //     System.out.println("Computer playing...");
        playerOneSetup();

            System.out.println("whos playing at this moment");

    }}

}


