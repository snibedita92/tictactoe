package com.tictactoe.stage2;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cells:");

        String cell = scanner.next();
        display(cell);
    }


    public static void display(String value) {
        System.out.println("---------");
        System.out.println("|" + " " + value.charAt(0) + " " + value.charAt(1) + " " + value.charAt(2) + " " + "|");
        System.out.println("|" + " " + value.charAt(3) + " " + value.charAt(4) + " " + value.charAt(5) + " " + "|");
        System.out.println("|" + " " + value.charAt(6) + " " + value.charAt(7) + " " + value.charAt(8) + " " + "|");
        System.out.println("---------");
    }
}




