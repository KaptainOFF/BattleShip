package com.company;

import java.util.Random;

public class Game implements Runnable {
    private Input input = new Input();
    private Random rand = new Random();
    private int tries = 5;
    private int randomColumn = rand.nextInt(5);
    private int randomRow = rand.nextInt(5);
    private int playerC;
    private int playerR;

    // Create battleship board 5 x 5
    public String[][] mBoard = new String[][] {
            {"O", "O", "O", "O", "O"},
            {"O", "O", "O", "O", "O"},
            {"O", "O", "O", "O", "O"},
            {"O", "O", "O", "O", "O"},
            {"O", "O", "O", "O", "O"}
    };

    public void run() {

        while (tries > 0) {
            System.out.printf("Please enter a column: ");
            playerC = input.getPlayerData();
            System.out.printf("Please enter a row: ");
            playerR = input.getPlayerData();

            if ((playerC == randomColumn) && (playerR == randomRow)) {
                System.out.println("You Win!");
                break;

            } else if (mBoard[playerC - 1 ][playerR -1 ] == "X"){
                System.out.println("You have already guessed here!");
                System.out.println();

            } else {
                mBoard[playerC - 1][playerR - 1] = "X";
                printBoard();
                tries--;
                System.out.println();
            }
            System.out.printf("You have %d tries left.%n", tries);
        }
    }

    //Print the game board
    public void printBoard() {
        for (int i = 0; i < mBoard.length; i++) {
            for (int j = 0; j < mBoard[0].length; j++) {
                System.out.print(mBoard[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

}
