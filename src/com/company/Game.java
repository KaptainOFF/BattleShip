package com.company;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private Random rand = new Random();
    private int column = rand.nextInt(5);
    private int row = rand.nextInt(5);
    Scanner scanner = new Scanner(System.in);

    // Create battleship board 5 x 5
    public String[][] mBoard = new String[][] {
            {"O", "O", "O", "O", "O"},
            {"O", "O", "O", "O", "O"},
            {"O", "O", "O", "O", "O"},
            {"O", "O", "O", "O", "O"},
            {"O", "O", "O", "O", "O"}
    };

    // Get the randomly generated row
    public int getRandRow() {
        return row;
    }

    // Get the randomly generated column
    public int getRandCol() {
        return column;
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
    /* Get player input for row
        checks if the input is a number and if it's in the desired range.
        if not it will ask again
     */
    public int getPlayerRow() {
        int playerRow = 0;
        try {
            System.out.printf("Horizontal: ");
            playerRow = scanner.nextInt();
            while (playerRow < 1 || playerRow > 5) {
                System.out.printf("Please enter a value between 1 and 5: ");
                playerRow = scanner.nextInt();
            }
        } catch(InputMismatchException ime) {
            System.out.println("Input must be integer");
        }
        return playerRow;
    }
    /* Get player input for column
        checks if the input is a number and if it's in the desired range.
        if not it will ask again
     */
    public int getPlayerCol() {
        int playerCol = 0;
        try {
            System.out.printf("Vertical: ");
            playerCol = scanner.nextInt();
            while (playerCol < 1 || playerCol > 5 ) {
                System.out.printf("Please enter a value between 1 and 5: ");
                playerCol = scanner.nextInt();
            }
        } catch(InputMismatchException ime) {
            System.out.println("Input must be integer");
        }
        return playerCol;
    }
}
