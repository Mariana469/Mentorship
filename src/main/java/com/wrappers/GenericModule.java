package com.wrappers;

import java.util.Collection;

public class GenericModule {
    static class Professions<T> {
        private T numberOfSpecialists;
        public Professions(T numberOfSpecialists) {
            this.numberOfSpecialists = numberOfSpecialists;
        }

        StringBuilder sb = new StringBuilder("This is: ");

        //Just wanted to try with StringBuilder for practice
        @Override
        public String toString() {
            return sb.toString() + numberOfSpecialists;
        }

    }
    static class DifferentNumbers<N extends Number> {
        private N maxNumber;
        private N minNumber;
        private N factNumber;

        public void setValueOfNumber(N maxNumber, N minNumber, N factNumber){
            this.maxNumber = maxNumber;
            this.minNumber = minNumber;
            this.factNumber = factNumber;
        }
    }
}
