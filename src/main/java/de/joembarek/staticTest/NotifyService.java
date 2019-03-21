package de.joembarek.staticTest;

import java.time.LocalDateTime;

public class NotifyService {

    int hour = LocalDateTime.now().getHour();
    int minutes = LocalDateTime.now().getMinute();
    int seconds = LocalDateTime.now().getSecond();

    String printTime() {
        //return "time now is: " + hour + ":" + minutes + ":" + seconds;
        return "time now is: " + LocalDateTime.now().getHour() + ":" + LocalDateTime.now().getMinute() +
                ":" + LocalDateTime.now().getSecond();
    }
}

