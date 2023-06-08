package com.demo.project.java8.staticmeth;

public class AreaDEmo implements Area{
    public static void getAreaCode()
    {
        System.out.println("hello area code in java");
    }
    public static void main(String str[])
    {
        Area.getAreaCode();
        AreaDEmo.getAreaCode();
    }
}
