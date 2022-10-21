package com.operators_loops;
import java.util.Scanner;

public class Factorial {

    private static final String ENTER_AN_INTEGER = "Enter an integer: ";
    private static final String FACTORIAL_OF_THE_NUMBER = "Factorial of the number ";
    private static final String IS = " is ";

    public static void main(String[] args) {
        System.out.println(ENTER_AN_INTEGER);
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int factorial = 1;
        for (int i = 0; i < number; i++) {
            factorial = factorial * i;
        }
        System.out.println(FACTORIAL_OF_THE_NUMBER + number + IS + factorial);
    }
}
