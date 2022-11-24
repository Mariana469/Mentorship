package com.wrappers;

public class Main {
    public static void main(String[] args) {
        GenericModule.Professions<String> java = new GenericModule.Professions<>("Teacher");
        GenericModule.Professions<Integer> java1 = new GenericModule.Professions<>(45);
        System.out.println(java);
        System.out.println(java1);
        GenericModule.DifferentNumbers someNumber = new GenericModule.DifferentNumbers();
        someNumber.setValueOfNumber(3,1.2, -0.01);
    }
}
