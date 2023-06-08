package com.demo.project.java8.functionalint;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String str[])
    {
        Function<Integer,Integer> func=(i)->i*i;
        //first is the input and second is output
        System.out.println(func.apply(4));
    }
}
