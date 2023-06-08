package com.demo.project.java8.defaultd;

public interface Vehicle {
    default void turnAlarmOff()
    {
        System.out.println("turn alarm of in Interfaceamb demo");
    }
}
