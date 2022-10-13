package com.arrays;

import java.util.Arrays;

public class FindArrayValue {
    public static void main(String[] args) {
        int[] array = new int[]{30, 50, 62, 42, 72};
        System.out.println("The input array: " + Arrays.toString(array));
        int key = 30;
        System.out.println("Key to be searched is: " + key);
        int first = 0;
        int last=array.length-1;
        int mid = (first + last)/2;
        while( first <= last ){
            if ( array[mid] < key ){
                first = mid + 1;
            }else if ( array[mid] == key ){
                System.out.println("Element is found at index: " + mid);
                break;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if ( first > last ){
            System.out.println("Element is not found!");
        }
    }
}
