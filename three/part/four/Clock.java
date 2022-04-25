package com.netcracker.tasks.three.part.four;

import java.time.LocalTime;

public class Clock {
    int hourAlarm;
    int minuteAlarm;
    public int getHours() {
        return LocalTime.now().getHour();
    }

    public int getMinute() {
        return LocalTime.now().getMinute();
    }

    public String getTime() {
        return getHours() + " " + getMinute();
    }

    public void setAlarm(int hour, int minute) {
        hourAlarm = hour;
        minuteAlarm = minute;
    }

    public void alarm(){
        while (true){
            if (getHours() == hourAlarm && getMinute() == minuteAlarm) {
                System.out.println("Alarm!!!");
                break;
            }
        }
    }
}
