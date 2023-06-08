package com.demo.project.java8.functionalint;

import com.demo.project.java8.functionalint.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDEmo {
    public static void main(String str[])
    {
        //get all user with role admin;
        List<User> userArrayList= Arrays.asList(new User("Ram","HR"),
                new User("Rohit","Admin"),new User("Rana","Admin"));

        Predicate<User> user=(User u)->userArrayList.get(1).getRole().equalsIgnoreCase("Admin");
        System.out.println(user.test(new User("Rohit","Admin")));
//getting all user which fall under admin group
    List<User> usd=    getAllAdminUser(userArrayList,(User u)->u.getRole().equalsIgnoreCase("Admin"));

System.out.println(usd.toString());
    }
    public static List<User> getAllAdminUser(List<User> user, Predicate<User> predicate)
    {
        List<User> userList=new ArrayList<>();
        for(User u:user) {
            if (predicate.test(u)) {
                userList.add(u);

            }
        }
        return userList;
    }
}
