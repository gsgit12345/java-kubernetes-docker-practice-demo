package com.demo.project.java8.defaultd;

public class demoval  implements Alarm,Vehicle{
    @Override
    public void turnAlarmOff() {
        Alarm.super.turnAlarmOff();
    }
    public static void main(String str[])
    {
        demoval demo=new demoval();
        demo.turnAlarmOff();
    }
}
