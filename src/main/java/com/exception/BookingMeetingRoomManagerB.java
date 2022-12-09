package com.exception;

public class BookingMeetingRoomManagerB extends BookingManagerA {
    @Override
    public Place bookPlace(int meetingRoomNumber) throws IncorrectPlaceNumberException {
        return super.bookPlace(meetingRoomNumber);
    }
}
