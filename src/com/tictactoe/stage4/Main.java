package com.tictactoe.stage4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cells: ");
        String cell = scanner.nextLine();
        char[][] ticTacToe = new char[][]{cell.substring(0, 3).toCharArray(), cell.substring(3, 6).toCharArray(), cell.substring(6, 9).toCharArray()};
        displayGrid(ticTacToe);
        updateGrid(ticTacToe);
        displayGrid(ticTacToe);
    }

    static void displayGrid(char[][] array) {
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0) {
                    System.out.print("| ");
                }

                else if (j == 4){
                    System.out.print("|");
                }
                else {
                    System.out.print(array[i][j - 1] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("---------");
    }

    static void updateGrid(char[][] arrayOne) {
        Scanner scanner = new Scanner(System.in);
        int row = 0, column = 0;
        boolean isCorrect = false;
        while (!isCorrect) {
            try {
                row = scanner.nextInt() - 1;
                column = scanner.nextInt() - 1;
                if (arrayOne[row][column] != '_') {
                    throw new Exception("This cell is occupied! Choose another one!");
                }
                isCorrect = true;
            } catch (InputMismatchException e) {
                System.out.println("You should enter numbers!");
                scanner.next();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Coordinates should be from 1 to 3!");
            } catch (Exception e) {
                System.out.println("This cell is occupied! Choose another one!");
            }
        }
        arrayOne[row][column] = 'X';
    }
}
