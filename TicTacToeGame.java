package com.game;

public class TicTacToeGame {
    static char[] board = new char[10];
     //Main Method
    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToeGame program ");

        // calling creatingBoard method
        creatingBoard();

    }

    // Creating a method
    static void creatingBoard() {
        for (int i = 1; i < 10; i++) {

            board[i] = ' ';
        }
    }
}
