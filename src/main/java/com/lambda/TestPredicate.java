package com.lambda;

import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static org.apache.commons.lang3.RandomUtils.nextInt;

public class TestPredicate {
    public Supplier<String> say() {
        return () -> "Hello";
    }

    public Predicate<String> getCompareValuesPredicate(int min, int max) {
        return s -> min <= s.length() && s.length() <= max;
    }

    public Predicate<String> checkEmptyString() {
        return String::isEmpty;
    }

    public BiFunction<String, Integer, String> getAndRepeatString() {
        return String::repeat;
    }

    public Supplier<Integer> generateRandomNumbers() {
        return () -> nextInt();
    }

    public Optional<String> createOptionalWithinString(String s) {
        return Optional.of(s);
    }

}