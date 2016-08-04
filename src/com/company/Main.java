package com.company;

public class Main {
    private static int tries = 0;

    public static void main(String[] args)  {
        Game game = new Game();

        while (tries < 5) {
            int playerC = game.getPlayerCol();
            int playerR = game.getPlayerRow();
            if (((playerC - 1) == game.getRandCol()) && ((playerR - 1) == game.getRandRow())) {
                System.out.println("You Win!");
                break;
            } else {
                game.mBoard[playerC][playerR] = "X";
                game.printBoard();
            }
            tries++;
        }
    }
}
