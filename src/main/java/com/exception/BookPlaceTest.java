package com.exception;

public class BookPlaceTest {
    public static void main(String[] args) {
        BookPlaceManager manager = new BookPlaceManager();
        try {
            Place place = manager.book(21);
        } catch (IncorrectPlaceNumberException e) {
            System.err.println(e);
        }
    }
}
