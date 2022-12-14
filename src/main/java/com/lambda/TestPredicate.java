package com.lambda;

import java.util.Optional;
import java.util.function.Function;
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

    public Function<String, String> getAndRepeatString() {
        return s -> s.repeat(5);
    }

    public Supplier<Integer> generateRandomNumbers() {
        return () -> nextInt();
    }

    public Optional<String> createOptionalWithinString(String s) {
        return Optional.of(s);
    }

}