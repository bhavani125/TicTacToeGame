package com.game;

import java.util.Scanner;
import java.util.Random;

public class TicTacToeGame {
    //constant variables
    static char[] board = new char[10];
    static char player, computer;
    static int[] computerNum;
    static Scanner sc = new Scanner(System.in);
    static final Random random = new Random();

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
        //calling desiredMove method
        desiredMove();
        //calling whoPlayFirst Method
        whoPlayFirst();
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
    static void showBoard() {
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
        System.out.println("\nUser to select number from 1to9:\n");
        int userChoice = sc.nextInt();
        //calling current board method
        currentBoard();
        //checking free space
        if (board[userChoice] == 'X' || board[userChoice] == 'O') {
            System.out.println("there is no free space");
        } else {
            System.out.println("there is free space");
        }
    }

    //creating a method for user move and  checking free space
    static void desiredMove() {
        System.out.println("User to select the number from 1 o 9");
        int userChoice = sc.nextInt();
        if (board[userChoice] != 'X' || board[userChoice] != 'O') {
            board[userChoice] = player;
            System.out.println("there is  free space");
        } else {
            System.out.println("there is no free space");
        }
        //calling current board
        currentBoard();
    }

    //Creating Method for WhoPlayFirst
    static void whoPlayFirst() {
        System.out.println("\nMaking toss to check who play first\n\nselect the number 1 for head and 2 for tail\n ");
        int check = sc.nextInt();
        if (check == 1 || check == 2) {
            int flip = random.nextInt(2) + 1;
            if (flip == 1) {
                System.out.println("\nBy tossing Coin it shows HEAD\n");
            } else {
                System.out.println("\nBy tossing Coin it shows TAIL\n");
            }
            if (flip == check) {
                System.out.println("u won the toss then You have to start the game\n");
                desiredMove();
            } else {
                System.out.println(" You lost the toss now its computer turn first\n");
                computerMove();
            }
        } else {
            System.out.println("\nInvalid input Again\n");
            whoPlayFirst();
        }
    }
    //creating  for computer move
    static void computerMove() {
        computerNum = new int[9];
        int  computerChoice = random.nextInt(9)+1;
        board[computerChoice]=computer;
        System.out.println("the computer choice "+computerChoice+"' now its your turn.");
        desiredMove();
    }
}


