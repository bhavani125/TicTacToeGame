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
        //calling userMove method
        userMove();

    }

    // Creating a method
    static void creatingBoard() {
        for (int i = 1; i < 10; i++) {

            board[i] = ' '; //initializing empty space
        }
    }

    //creating method for choosing option
    static void playerChoice() {
        System.out.println("Player to choose the letter X or O ");
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
    // creating method for user to move
    static void userMove() {
        System.out.println("\nUser to select the number from 1to9:\n");
        int userChoice = sc.nextInt();
        //calling current board method
        currentBoard();
        //checking free space
        if (board[userChoice] == 'X' || board[userChoice] == 'O') {
            System.out.println("there is no free space");
        }else{
            System.out.println("there is free space");
        }
    }
}

