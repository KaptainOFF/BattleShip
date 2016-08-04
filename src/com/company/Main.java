package com.company;

public class Main {
    private static int tries = 0;

    public static void main(String[] args) {
        Game game = new Game();
        do {
            game.printBoard();
            game.getPlayerCol();
            game.getPlayerRow();

            if (game.getPlayerCol() != game.getRandCol() && game.getPlayerRow() != game.getRandRow()) {
                game.mBoard[game.getPlayerCol()][game.getPlayerRow()] = "X";
                game.printBoard();
            }
            tries++;
        } while (game.getPlayerCol() != game.getRandCol() && game.getPlayerRow() != game.getRandRow() || tries < 5);
    }
}
