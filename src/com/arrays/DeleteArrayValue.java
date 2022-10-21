package com.arrays;

import java.util.Arrays;

class DeleteArrayValue {

    private static final String ORIGINAL_ARRAY = "Original Array: ";
    private static final String ELEMENT_TO_BE_DELETED_AT_INDEX = "Element to be deleted at index: ";
    private static final String ARRAY_AFTER_DELETING_AN_ELEMENT = "Array after deleting an element: ";

    public static void main(String[] args) {
        int[] intArray = {10, 20, 30, 40, 50};
        System.out.println(ORIGINAL_ARRAY + Arrays.toString(intArray));
        int index = 2;
        System.out.println(ELEMENT_TO_BE_DELETED_AT_INDEX + index);
        int[] copyArray = new int[intArray.length - 1];
        System.arraycopy(intArray, 0, copyArray, 0, index);
        System.arraycopy(intArray, index + 1, copyArray, index, intArray.length - index - 1);
        System.out.println(ARRAY_AFTER_DELETING_AN_ELEMENT + Arrays.toString(copyArray));
    }
}