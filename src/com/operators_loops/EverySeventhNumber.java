package com.operators_loops;

import java.util.Scanner;

public class EverySeventhNumber {
    public static void main(String[] args) {
        System.out.println("Введіть будь яке число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            if ((i%7)==0) {
                System.out.println(i);
            }
        }

    }
}