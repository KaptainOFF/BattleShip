package com.company;

import java.util.InputMismatchException;

public class Main {
    private static int tries = 5;

    public static void main(String[] args)  {
        Game game = new Game();
        int playerC = 0;
        int playerR = 0;

        while (tries > 0) {

            try {
                playerC = game.getPlayerCol();
            } catch (InputMismatchException ime) {
                System.out.println("Input must be a number!");
            }

            try {
                playerR = game.getPlayerRow();
            } catch (InputMismatchException ime) {
                System.out.println("Input must be a number!");
            }


            if ((playerC == game.getRandCol()) && (playerR == game.getRandRow())) {
                System.out.println("You Win!");
                break;

            } else if (game.mBoard[playerC - 1 ][playerR -1 ] == "X"){
                System.out.println("You have already guessed here!");
                System.out.printf("You have %d tries left.", tries);
                System.out.println();

            } else {
                game.mBoard[playerC - 1][playerR - 1] = "X";
                game.printBoard();
                tries--;
                System.out.printf("You have %d tries left.", tries);
                System.out.println();
            }
        }
        System.out.println("Game Over");
    }
}
