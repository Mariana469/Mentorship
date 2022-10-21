package com.arrays;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println("How many numbers you want to add?");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println("Enter the numbers you want to add: ");
        int[] numbers = new int[num];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] <= 0) {
                System.out.println("You entered incorrect number");
                System.exit(0);
            }
        }
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        System.out.println(result);
    }
}

