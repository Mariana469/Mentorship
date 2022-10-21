package com.arrays;

public class SimilarValuesInArray {
    public static void main(String[] args) {
        int[] firstArray = {2, 5, 8, 9, 3, 8};
        int[] secondArray = {6, 5, 5, 9, 2, 10};

        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                if (firstArray[i] == secondArray[j]) {
                    System.out.println("Found similar value: " + firstArray[i] + ", " + secondArray[j]);

                }
            }

        }
    }
}
