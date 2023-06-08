package com.demo.project.java8.defaultd;

public interface Alarm {
    default void turnAlarmOff()
    {
        System.out.println("turn off alarm in alarm interface");
    }
}
