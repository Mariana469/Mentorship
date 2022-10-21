package com.arrays;

public class AverageNumber {
    public static void main(String[] args) {
        int[] array = new int[]{3, 5, 6, 4, 7};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("An average number is: " + sum / array.length);
    }
}
