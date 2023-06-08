package com.demo.project.java8.defaultd;

public interface interface2 extends  interface1{
    default void say()
    {
        System.out.println("this default in interface2");
    }
}
