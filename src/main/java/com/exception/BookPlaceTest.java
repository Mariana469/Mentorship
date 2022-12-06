package com.exception;

public class BookPlaceTest {
    public static void main(String[] args) {
        BookPlaceManager manager = new BookPlaceManager();
        Place anotherPlace = new Place();
        try {
            Place place = manager.book(21);
            anotherPlace = null;
            System.out.println(anotherPlace.toString());
        } catch (IncorrectPlaceNumberException e) {
            System.err.println(e);
        }
    }
}
