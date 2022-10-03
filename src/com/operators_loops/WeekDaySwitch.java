package com.operators_loops;

public class WeekDaySwitch {

    private static final String MONDAY = "Monday";
    private static final String TUESDAY = "Tuesday";
    private static final String WEDNESDAY = "Wednesday";
    private static final String THURSDAY = "Thursday";
    private static final String FRIDAY = "Friday";
    private static final String WEEKEND = "Weekend";
    private static final String GOOD_LUCK = "Good luck!";

    public static void main(String[] args) {

        displayWeekDay(3);
    }

    static void displayWeekDay(int number) {
        switch (number) {
            case 1:
                System.out.println(MONDAY);
                break;
            case 2:
                System.out.println(TUESDAY);
                break;
            case 3:
                System.out.println(WEDNESDAY);
                break;
            case 4:
                System.out.println(THURSDAY);
                break;
            case 5:
                System.out.println(FRIDAY);
                break;
            case 6:
                System.out.println(WEEKEND);
                break;
            case 7:
                System.out.println(WEEKEND);
                break;
            default:
                System.out.println(GOOD_LUCK);

        }

    }

}
