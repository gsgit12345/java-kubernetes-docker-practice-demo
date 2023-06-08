package com.demo.project.java8.functionalint;

import java.util.function.Consumer;

public class ConsumerJoingin {
    public static void main(String str[])
    {
        Consumer<String> lowercase=(a)-> System.out.println(a.toUpperCase());
        Consumer<String> joina=(a)->System.out.println( a +=".txt");
        lowercase.andThen(joina).accept("hello");
        System.out.println(lowercase);
    }
}
