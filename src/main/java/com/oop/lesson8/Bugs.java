package com.oop.lesson8;

import org.jetbrains.annotations.NotNull;

public class Bugs implements Comparable<Bugs> {
    private String bugName;

    @Override
    public int compareTo(@NotNull Bugs b) {
        return 0;
    }
}
