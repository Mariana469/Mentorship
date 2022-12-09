package com.exception;

public class PurchaseOrder {
    public static void main(String[] args) {
        try {
            int poNumbers[] = new int[10];
            poNumbers[11] = 123456;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index is Out Of Bounds");
        } finally {
            System.out.println("Only 10 POs can be created");
        }

    }
}
