package com.company;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private Random rand = new Random();
    private int column = rand.nextInt(5);
    private int row = rand.nextInt(5);
    Scanner scanner = new Scanner(System.in);

    public String[][] mBoard = new String[][] {
            {"O", "O", "O", "O", "O"},
            {"O", "O", "O", "O", "O"},
            {"O", "O", "O", "O", "O"},
            {"O", "O", "O", "O", "O"},
            {"O", "O", "O", "O", "O"}
    };

    public int getmRow() {
        return row;
    }

    public int getmCol() {
        return column;
    }

    public void printBoard() {
        for (int i = 0; i < mBoard.length; i++) {
            for (int j = 0; j < mBoard[0].length; j++) {
                System.out.print(mBoard[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public int getPlayerRow() {
        int playerRow = scanner.nextInt();
        return playerRow;
    }

    public Game() {

    }
}
