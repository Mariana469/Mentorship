package com.exception;

public class BookingMeetingRoomManagerB extends BookingManagerA {
    @Override
    public Place book(int meetingRoomNumber) throws IncorrectPlaceNumberException {
        return super.book(meetingRoomNumber);
    }
}
