package com.demo.project.java8.utilitydemo;

import java.util.function.LongUnaryOperator;

public class FactorialUsingLambda {
    public static void main(String str[]) {
        LongUnaryOperator factorial = n -> {
            long result = 1;
            for (long i = 1; i < n; i++) {
                result = result * i;
            }
            return result;
        };
        long num = 5;
        long factorial2 = factorial.applyAsLong(num);
        System.out.println(factorial2);
    }
}
//https://www.w3resource.com/java-exercises/lambda/java-lambda-exercise-7.php