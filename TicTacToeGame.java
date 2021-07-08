package com.game;

import java.util.Scanner;

public class TicTacToeGame {
    //constant variables
    static char[] board = new char[10];
    static char player, computer;
    static Scanner sc = new Scanner(System.in);

    //Main Method
    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToeGame program ");

        // calling creatingBoard method
        creatingBoard();
        //calling playerChoice method
        playerChoice();

    }

    // Creating a method
    static void creatingBoard() {
        for (int i = 1; i < 10; i++) {

            board[i] = ' '; //initializing empty space
        }
    }

    //creating method for choosing option
    static void playerChoice() {
        System.out.println("choose the letter X or O ");
        player = sc.next().charAt(0);
        if (player == 'X') {
            computer = 'O';
        } else {
            computer = 'X';
        }

    }
}

