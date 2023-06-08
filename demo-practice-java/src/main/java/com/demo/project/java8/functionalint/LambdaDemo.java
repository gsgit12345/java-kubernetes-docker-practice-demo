package com.demo.project.java8.functionalint;

import java.util.function.BiConsumer;

public class LambdaDemo {
    public static void main(String str[])
    {
        LambdaDemo demo=new LambdaDemo();
        int a=demo.addTwoNum(5,1);
      System.out.println("a is :"+a);
      //all above code is without lambda .now below code is using lambda

        BiConsumer<Integer,Integer> biConsumer= (c,b)->System.out.println(c+b);
        biConsumer.accept(2,4);
        //with  lamda it is single line code
    }
    public int addTwoNum(int a, int b)
    {
        return a+b;
    }
}
