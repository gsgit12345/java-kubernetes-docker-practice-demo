package com.demo.project.java8.defaultd;

public class defaultdemo implements interface1,interface2{
    //here creating ambiguity in class because in both method ,function name is same.
    //default can be used in interface only.not in the class
    /*public default void  say()
    {

    }*/
    public void say()
    {
       System.out.println("hello default") ;
    }
    public static void main(String str[])
    {
        defaultdemo  dd=new defaultdemo();
        dd.say();

    }
}
