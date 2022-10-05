package com.arrays;

public class StringToNumber {
    public static void main(String[] args) {
        try {
            String s = "3.6";
            String s1 = s.replaceAll(",",".");
            String s2 = s1.replaceAll(" ", ".");
            double number = Double.parseDouble(s2);
            System.out.println("Double number = " + number);
        }
        catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}