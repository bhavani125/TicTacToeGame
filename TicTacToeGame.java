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
        //Calling CurrentBoard method
        currentBoard();

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
    //Creating a method for showBoard
    static void showBoard(){
        System.out.println("     |     |     ");
        System.out.println("  " + board[1] + "  | " + board[2] + "   | " + board[3] + "  ");
        System.out.println(".....|.....|.....");
        System.out.println("  " + board[4] + "  | " + board[5] + "   | " + board[6] + "  ");
        System.out.println(".....|.....|.....");
        System.out.println("  " + board[7] + "  | " + board[8] + "   | " + board[9] + "  ");
        System.out.println("     |     |      ");
    }
    //writing a method to show current board
    private static void currentBoard() {
        int RADIX = 10;  //radix is used to convert int to char
        System.out.println("\n");
        for (int i = 1; i < 10; i++) {
            if (board[i] != 'X' && board[i] != 'O')
                board[i] = Character.forDigit(i, RADIX);
        }
        //calling show board method  here
        showBoard();
    }
}

