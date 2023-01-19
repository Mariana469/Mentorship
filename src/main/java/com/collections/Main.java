package com.collections;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String someText = "Ar Ar r бо yList, використовує динамічний масив для зберігання повторюваних елементів різних типів даних. ArrayList підтримує порядок вставки.";
        TestCollection myTestCollection = new TestCollection(someText);
        System.out.println(myTestCollection.getWordsCount());
        myTestCollection.deleteEachElementBiggerThenSix();
        myTestCollection.addAsteriskToEachElementLessThenThreeAndSort();
        myTestCollection.findUniqueElements();
        Student Ira = new Student(10, "Iryna Vorochak", 635896321, Student.faculty.HISTORY);
        Student Nastia = new Student(15, "Anastasia Velyka", 58236958, Student.faculty.HISTORY);
        Student NastiaCopy = new Student(15, "Anastasia Velyka", 58236958, Student.faculty.HISTORY);
        HashSet<Object> students = new HashSet<>();
        students.add(Ira);
        students.add(Nastia);
        students.add(NastiaCopy);
        System.out.println(students.size());

    }
}
