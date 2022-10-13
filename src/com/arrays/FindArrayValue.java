package com.arrays;

import java.util.Arrays;

public class FindArrayValue {
    private static final String THE_INPUT_ARRAY = "The input array: ";
    private static final String KEY_TO_BE_SEARCHED_IS = "Key to be searched is: ";
    private static final String ELEMENT_IS_FOUND_AT_INDEX = "Element is found at index: ";
    private static final String ELEMENT_IS_NOT_FOUND = "Element is not found!";

    public static void main(String[] args) {
        int[] array = new int[]{30, 50, 62, 42, 72};

        System.out.println(THE_INPUT_ARRAY + Arrays.toString(array));
        int key = 30;
        System.out.println(KEY_TO_BE_SEARCHED_IS + key);
        int first = 0;
        int last=array.length-1;
        int mid = (first + last)/2;
        while( first <= last ){
            if ( array[mid] < key ){
                first = mid + 1;
            }else if ( array[mid] == key ){
                System.out.println(ELEMENT_IS_FOUND_AT_INDEX + mid);
                break;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if ( first > last ){
            System.out.println(ELEMENT_IS_NOT_FOUND);
        }
    }
}
