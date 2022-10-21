package com.arrays;

public class MaxMinValue {

    private static final String LARGEST_ELEMENT_PRESENT_IN_GIVEN_ARRAY = "Largest element present in given array: ";
    private static final String SMALLEST_ELEMENT_PRESENT_IN_GIVEN_ARRAY = "Smallest element present in given array: ";

    public static void main(String[] args) {
        int[] arr = new int[]{25, 11, 7, 75, 56};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        System.out.println(LARGEST_ELEMENT_PRESENT_IN_GIVEN_ARRAY + max);
        System.out.println(SMALLEST_ELEMENT_PRESENT_IN_GIVEN_ARRAY + min);
    }
}
