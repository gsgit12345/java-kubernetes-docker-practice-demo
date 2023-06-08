package com.demo.project.java8.utilitydemo;

import java.math.BigInteger;

public class FindFactorialOfBigNum {
    public static void main(String str[])
    {
        BigInteger big=findFactLargNum(5);
        System.out.println(big);
    }
    public static BigInteger findFactLargNum(int num)
    {
        BigInteger result =BigInteger.ONE;
        for (int i=1;i<=num;i++)
        {
            result=result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
