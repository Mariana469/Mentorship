package com.oop.lesson7;

import org.jetbrains.annotations.NotNull;

public class Person implements Comparable<Person> {
    private String name;

    @Override
    public int compareTo(@NotNull Person p) {
        return 0;
    }
}
