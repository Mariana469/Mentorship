package com.exception;

public class BookingTest {
    public static void main(String[] args) {
        BookingMonitorManagerC bookingMonitorManager = new BookingMonitorManagerC();
        BookingManagerA manager = new BookingManagerA();
        manager = bookingMonitorManager;
        Place anotherPlace = new Place();
        try {
            Place place = manager.bookPlace(21);
            anotherPlace = null;
            System.out.println(anotherPlace.toString());
        } catch (IncorrectPlaceNumberException e) {
            e.printStackTrace();
            // wanted to try printStackTrace method
        }
    }
}
