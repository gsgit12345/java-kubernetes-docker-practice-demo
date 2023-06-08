package com.demo.project.java8.functionalint;

import java.util.function.Predicate;

public class CheckStringLengthUsingPredicate {
    public static void main(String str[])
    {
        Predicate<String> lenPredicate=(String str2)->str2.length()>6;
    System.out.println(    lenPredicate.test("hello0o"));
    }
}
