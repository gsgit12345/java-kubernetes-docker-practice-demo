package com.demo.project.java8.functionalint;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String str[])
    {
        Consumer<String> consume=(a)->System.out.println("hello"+a);
        consume.accept("hello i am in java");

        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);

        Consumer<Integer> consumelis=(a)->System.out.println(a);
        printlist(list,consumelis);
    }
    public static void printlist(List<Integer> inte,Consumer<Integer> con)
    {
        for(Integer i:inte)
        con.accept(i);
    }
}
