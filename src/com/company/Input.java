package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    Scanner scr = new Scanner(System.in);

    public int getPlayerData() {
       int input = 0;
        do {
            try {
                input = scr.nextInt();
            } catch (InputMismatchException ime) {
                System.out.printf("Input needs to be a number!");
            }
        } while ( input < 0 || input > 5);
        return input;
    }
}
