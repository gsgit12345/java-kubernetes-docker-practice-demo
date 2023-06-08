package com.demo.project.java8.functionalint;

import java.util.function.Predicate;

public class PredicateJoiningDemo {
    public static void main(String str[])
    {
        Predicate<String>   testLength=(a)->a.length()>5;
        testLength.test("hellooo");

        Predicate<String> oddeven=(a)->a.length()%2==0;

        oddeven.test("hellooo");

        boolean emp=testLength.and(oddeven).test("hellooo");
        boolean emp1=testLength.or(oddeven).test("hellooo");
        boolean emp2=testLength.negate().test("hellooo");

        System.out.println("lll:-"+emp);
        System.out.println("lll:-"+emp1);
        System.out.println("lll:-"+emp2);
//negate always work with only one predicate

    }
}
