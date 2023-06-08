package com.demo.project.java8.functionalint;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionalChaining {
    public static void main(String str[])
    {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        Function<Integer,Integer> doublefunct=(i)->i*2;
Function<Integer,Integer> square=(i)->i*i;
//function chaining
      List<Integer> doubval=  list.stream().map(square).map(doublefunct).collect(Collectors.toList());
      System.out.println(doubval.toString());
//anther way
      //  list.stream().map((i)->i*2).collect(Collectors.toList()).forEach(System.out::print);
        //function chaining
        Function<Integer,Integer> squareanddouble=doublefunct.andThen(square);
    //    list.stream().map(squareanddouble).collect(Collectors.toList()).forEach(System.out::print);

        Function<Integer, Integer> squareAndDouble = doublefunct.compose(square);
        list.stream().map(squareanddouble).collect(Collectors.toList()).forEach(System.out::print);




    }
}
