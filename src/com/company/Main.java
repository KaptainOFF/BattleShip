package com.company;

public class Main {
    private static int tries = 0;

    public static void main(String[] args)  {
        Game game = new Game();

        while (tries < 5) {
            int playerC = game.getPlayerCol();
            int playerR = game.getPlayerRow();
            if (((playerC - 1) == game.getRandCol() - 1) && ((playerR -1 ) == game.getRandRow() - 1)) {
                System.out.println("You Win!");
                break;
            } else {
                game.mBoard[playerC - 1][playerR - 1] = "X";
                game.printBoard();
            }
            tries++;
        }
        System.out.println("Sorry, you lose!");
    }
}
