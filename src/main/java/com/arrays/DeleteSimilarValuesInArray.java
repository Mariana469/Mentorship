package com.arrays;
import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class DeleteSimilarValuesInArray {
    public static void main(String[] args) {
        int[] arrayWithSimilarValues = {2, 5, 8, 9, 3, 8, 9};

        for (int i = 0; i < arrayWithSimilarValues.length-1; i++) {
            for (int j = i +1; j < arrayWithSimilarValues.length; j++) {
                if (arrayWithSimilarValues[i] == arrayWithSimilarValues[j]) {
                    System.out.println("Deleting similar values: " + arrayWithSimilarValues[i] + ", " + arrayWithSimilarValues[j]);
                    arrayWithSimilarValues = ArrayUtils.remove (arrayWithSimilarValues, j);
                }
            }

        }
        System.out.println("Array after deleting the similar values: " + Arrays.toString(arrayWithSimilarValues));
    }
}
