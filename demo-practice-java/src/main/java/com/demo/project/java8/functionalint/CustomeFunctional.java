package com.demo.project.java8.functionalint;

public interface CustomeFunctional {
    public void  addNumber(int a,int b);

    default void say() {
        System.out.println("hello");
    }

}

