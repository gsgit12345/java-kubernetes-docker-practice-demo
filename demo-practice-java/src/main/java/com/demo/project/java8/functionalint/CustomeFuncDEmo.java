package com.demo.project.java8.functionalint;

public class CustomeFuncDEmo {
    public static void main(String str[])
    {
        CustomeFunctional func=( a, b)->System.out.println(a+b);
        func.addNumber(3,5);
    }
}
