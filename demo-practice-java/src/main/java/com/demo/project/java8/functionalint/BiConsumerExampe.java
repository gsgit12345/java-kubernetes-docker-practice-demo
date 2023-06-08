package com.demo.project.java8.functionalint;

import java.util.function.BiConsumer;

public class BiConsumerExampe {
    public static void main(String str[])
    {
       addTwo("node",".js",(x,y)->System.out.println(x+y));
    }

    public  static <T> void addTwo(T a, T b, BiConsumer<T,T> biConsumer)
    {
        biConsumer.accept(a,b);
    }
}
