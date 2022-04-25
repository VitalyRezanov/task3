package com.netcracker.tasks.three.part.four;

public class WorldClock extends Clock {

    private int timeZone;

    public WorldClock(int timeZone) {
        this.timeZone = timeZone;
    }

    @Override
    public int getHours() {
        return super.getHours() + timeZone;
    }

    @Override
    public void setAlarm(int hour, int minute) {
        super.setAlarm(hour + timeZone, minute);
    }
}
