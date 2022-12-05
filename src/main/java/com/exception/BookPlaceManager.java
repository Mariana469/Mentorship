package com.exception;

public class BookPlaceManager {
    public Place book(int placeNumber) throws IncorrectPlaceNumberException {
        if (placeNumber < 20) {
            return new Place();
        } else {
            throw new IncorrectPlaceNumberException("Could not find place with number " + placeNumber);
        }
    }
}
