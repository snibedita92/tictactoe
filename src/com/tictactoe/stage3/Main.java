package com.tictactoe.stage3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cells: ");
        String cells = scanner.next();
        displayGrid(cells);
        statusOfGame(cells);

    }

    public static void displayGrid(String value) {
        System.out.println("---------");
        char[][] arrays = new char[3][3];
        int count = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                arrays[i][j] = value.charAt(count++);

                System.out.print(arrays[i][j] + " ");
                if (j == 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
        }
        System.out.println("---------");
    }

    public static void statusOfGame(String grid) {
        int no_of_X = 0;
        int no_of_Zero = 0;
        int X_Won = 0;
        int O_Won = 0;
        char[][] array = new char[3][3];
        int number = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = grid.charAt(number++);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] == 'X') {
                    no_of_X += 1;
                } else if (array[i][j] == 'O') {
                    no_of_Zero += 1;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[0][0] == 'X' && array[0][1] == 'X' && array[0][2] == 'X') {
                    X_Won = X_Won + 1;
                } else if (array[1][0] == 'X' && array[1][1] == 'X' && array[1][2] == 'X') {
                    X_Won = X_Won + 1;
                } else if (array[2][0] == 'X' && array[2][1] == 'X' && array[2][2] == 'X') {
                    X_Won = X_Won + 1;
                } else if (array[0][0] == 'X' && array[1][0] == 'X' && array[2][0] == 'X') {
                    X_Won = X_Won + 1;
                } else if (array[0][1] == 'X' && array[1][1] == 'X' && array[2][1] == 'X') {
                    X_Won = X_Won + 1;
                } else if (array[0][2] == 'X' && array[1][2] == 'X' && array[2][2] == 'X') {
                    X_Won = X_Won + 1;
                } else if (array[0][0] == 'X' && array[1][1] == 'X' && array[2][2] == 'X') {
                    X_Won = X_Won + 1;
                } else if (array[0][2] == 'X' && array[1][1] == 'X' && array[2][0] == 'X') {
                    X_Won = X_Won + 1;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[0][0] == 'O' && array[0][1] == 'O' && array[0][2] == 'O') {
                    O_Won = O_Won + 1;
                } else if (array[1][0] == 'O' && array[1][1] == 'O' && array[1][2] == 'O') {
                    O_Won = O_Won + 1;
                } else if (array[2][0] == 'O' && array[2][1] == 'O' && array[2][2] == 'O') {
                    O_Won = O_Won + 1;
                } else if (array[0][0] == 'O' && array[1][0] == 'O' && array[2][0] == 'O') {
                    O_Won = O_Won + 1;
                } else if (array[0][1] == 'O' && array[1][1] == 'O' && array[2][1] == 'O') {
                    O_Won = O_Won + 1;
                } else if (array[0][2] == 'O' && array[1][2] == 'O' && array[2][2] == 'O') {
                    O_Won = O_Won + 1;
                } else if (array[0][0] == 'O' && array[1][1] == 'O' && array[2][2] == 'O') {
                    O_Won = O_Won + 1;
                } else if (array[0][2] == 'O' && array[1][1] == 'O' && array[2][0] == 'O') {
                    O_Won = O_Won + 1;
                }
            }
        }
            if (X_Won > 0 && O_Won > 0) {
                System.out.println("Impossible");
            } else if (no_of_X > no_of_Zero + 1 || no_of_Zero > no_of_X + 1) {
                System.out.println("Impossible");
            } else if (X_Won > 0) {
                System.out.println("X wins");
            } else if (O_Won > 0) {
                System.out.println("O wins");
            } else if (X_Won == 0 && O_Won == 0 && no_of_X + no_of_Zero == 9) {
                System.out.println("Draw");
            } else if (X_Won == 0 && O_Won == 0 && no_of_X + no_of_Zero < 9) {
                System.out.println("Game not finished");
            }




    }
}





