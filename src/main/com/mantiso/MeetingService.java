package com.mantiso;

public class MeetingService implements  IMeetingService {

    @Override
    public String[] getAttendees() {
        return new String[]{"Alex", "Bob", "Chris", "Deepak"};
    }
}
