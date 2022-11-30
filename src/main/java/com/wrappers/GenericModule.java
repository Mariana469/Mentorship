package com.wrappers;

public class GenericModule {
    public interface Convertible<K, V> {
        public V convertNumber(K k);
    }

    public static class Professions<T> {
        StringBuilder sb = new StringBuilder("This is: ");
        private T numberOfSpecialists;

        public Professions(T numberOfSpecialists) {
            this.numberOfSpecialists = numberOfSpecialists;
        }

        //Just wanted to try with StringBuilder for practice
        @Override
        public String toString() {
            return sb.toString() + numberOfSpecialists;
        }

    }

    public static class DifferentNumbers<N extends Number> {
        private N maxNumber;
        private N minNumber;
        private N factNumber;
    }

    public static class MaxValueHolder<T extends Comparable<T>> {
        private T maxValue;
        private T originalValue;

        public MaxValueHolder(T maxValue, T originalValue) {
            this.maxValue = maxValue;
            this.originalValue = originalValue;
        }

        public T getMaxValue() {
            return maxValue;
        }

        public void put(T t) {
            if (this.maxValue.compareTo(t) >= 0) {
                originalValue = t;
            } else {
                throw new NullPointerException();
            }
        }
    }
}
