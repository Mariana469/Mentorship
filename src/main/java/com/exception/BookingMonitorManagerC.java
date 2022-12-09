package com.exception;

public class BookingMonitorManagerC extends BookingMeetingRoomManagerB {
    //Added A, B, C in the end of class names so that it matches the task requirement
    @Override
    public Place bookPlace(int monitorNumber) throws IncorrectPlaceNumberException {
        return super.bookPlace(monitorNumber);
    }
}
