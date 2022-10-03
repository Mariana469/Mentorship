package com.operators_loops;

public class WeekDay {

    private static final String MONDAY = "Monday";
    private static final String TUESDAY = "Tuesday";
    private static final String WEDNESDAY = "Wednesday";
    private static final String THURSDAY = "Thursday";
    private static final String FRIDAY = "Friday";
    private static final String WEEKEND = "Weekend";
    private static final String GOOD_LUCK = "Good luck!";

    public static void main(String[] args) {

        displayWeekDay(5);
    }

    static void displayWeekDay(int number) {
        if (number == 1) {
            System.out.println(MONDAY);
        } else if (number == 2) {
            System.out.println(TUESDAY);
        } else if (number == 3) {
            System.out.println(WEDNESDAY);
        } else if (number == 4) {
            System.out.println(THURSDAY);
        } else if (number == 5) {
            System.out.println(FRIDAY);
        } else if (number == 6 || number == 7) {
            System.out.println(WEEKEND);
        } else {
            System.out.println(GOOD_LUCK);

        }

    }

}
