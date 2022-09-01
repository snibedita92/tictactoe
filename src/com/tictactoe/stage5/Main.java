package com.tictactoe.stage5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cell = "         ";
        char[][] ticTacToe = new char[][]{cell.substring(0, 3).toCharArray(), cell.substring(3, 6).toCharArray(), cell.substring(6, 9).toCharArray()};

            displayGrid(ticTacToe);
            updateGrid(ticTacToe);
            
            

    }

    static void displayGrid(char[][] arrays) {
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0) {
                    System.out.print("| ");
                } else if (j == 4) {
                    System.out.print("|");
                } else {
                    System.out.print(arrays[i][j - 1] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("---------");
    }

    static void updateGrid(char[][] arrayOne) {
        Scanner scanner = new Scanner(System.in);
        int x = 0, y = 0, queue = 0;
        boolean flag = false;

        while (!flag) {
            boolean isCorrect = false;
            while (!isCorrect) {
                try {
                    x = scanner.nextInt() - 1;
                    y = scanner.nextInt() - 1;
                    if (arrayOne[x][y] != ' ') throw new Exception();
                    isCorrect = true;
                } catch (InputMismatchException e) {
                    scanner.nextLine();
                    System.out.println("You should enter numbers!");
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Coordinates should be from 1 to 3!");
                } catch (Exception e) {
                    System.out.println("This cell is occupied! Choose another one!");
                }
            }
            if (queue % 2 != 0) {
                arrayOne[x][y] = 'O';
            } else {
                arrayOne[x][y] = 'X';
            }
           displayGrid(arrayOne);
            queue++;
            flag = statusOfGame(arrayOne);
        }
    }
    static boolean statusOfGame(char[][] ticTacToe) {
            int winCount = 0;
            char winner = 'n';
            // win situations
            if (ticTacToe[0][0] != ' ' && ticTacToe[0][0] == ticTacToe[1][1] && ticTacToe[0][0] == ticTacToe[2][2]) {
                winner = ticTacToe[0][0];
                winCount++;
            } else if (ticTacToe[0][2] != ' ' && ticTacToe[0][2] == ticTacToe[1][1] && ticTacToe[0][2] == ticTacToe[2][0]) {
                winner = ticTacToe[0][2];
                winCount++;
            } else {
                for (int i = 0; i < 3; i++) {
                    if ((ticTacToe[i][0] != ' ' && ticTacToe[i][0] == ticTacToe[i][1] && ticTacToe[i][0] == ticTacToe[i][2]) ||
                            (ticTacToe[0][i] != ' ' && ticTacToe[0][i] == ticTacToe[1][i] && ticTacToe[0][i] == ticTacToe[2][i])) {
                        winner = ticTacToe[i][i];
                        winCount++;
                    }
                }
            }

            //output
            if (winCount == 1) {
                System.out.println(winner + " wins");
            } else if (winCount == 0) {
                boolean containsSpace = false;
                for (char[] row: ticTacToe) {
                    for (char c: row) {
                        if (c == ' ') {
                            containsSpace = true;
                            break;
                        }
                    }
                }
                if (containsSpace) {
                    return false;
                } else {
                    System.out.println("Draw");
                }
            }
            return true;
        }
    }




































