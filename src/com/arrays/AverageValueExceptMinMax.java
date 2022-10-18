package com.arrays;

public class AverageValueExceptMinMax {
    private static final String LARGEST_ELEMENT_PRESENT_IN_GIVEN_ARRAY = "Largest element present in given array: ";
    private static final String SMALLEST_ELEMENT_PRESENT_IN_GIVEN_ARRAY = "Smallest element present in given array: ";

    public static void main(String[] args) {
        int[] array = new int[]{3, 5, 6, 4, 7};
        int min = array[0];
        int max = array[0];
        int countSummed = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(LARGEST_ELEMENT_PRESENT_IN_GIVEN_ARRAY + max);
        System.out.println(SMALLEST_ELEMENT_PRESENT_IN_GIVEN_ARRAY + min);

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != max || array[i] != min) {
                sum += array[i];
                countSummed++;
            }
        }
        System.out.println("An average number is: " + sum / countSummed);
    }

}
