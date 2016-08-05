package com.company;

import java.util.ArrayList;

public class Main {
    private static int tries = 0;

    public static void main(String[] args)  {
        Game game = new Game();

        while (tries < 5) {
            int playerC = game.getPlayerCol();
            int playerR = game.getPlayerRow();


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
                tries++;
                System.out.printf("You have %d tries left.", tries);
                System.out.println();
            }
        }
        System.out.println("Game Over");
    }
}
