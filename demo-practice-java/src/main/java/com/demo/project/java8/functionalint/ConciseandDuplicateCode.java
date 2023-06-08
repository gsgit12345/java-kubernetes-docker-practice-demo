package com.demo.project.java8.functionalint;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ConciseandDuplicateCode {
    public static void main(String str[])
    {
        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
        final List<String> editors =
                Arrays.asList("Brian", "Jackie", "John", "Mike");
        final List<String> comrades =
                Arrays.asList("Kate", "Ken", "Nick", "Paula", "Zach");

        //The goal is to filter out names that start with a certain letter. First, here is a naive approach to this task using the filter() method.

        final long countFriendsStartN =
                friends.stream()
                        .filter(name -> name.startsWith("N"))
                        .count();
        final long countEditorsStartN =
                editors.stream()
                        .filter(name -> name.startsWith("N"))
                        .count();
        final long countComradeStartN =
                comrades.stream()
                        .filter(name -> name.startsWith("N"))
                        .count();
//here we are doing duplicacy in code but reusable .the code is concise.we do not write the lengthy code here.

        //here to remove the duplicate code .assign the lambda expression in variable type predicate

        final Predicate<String> startsWithN =
                name -> name.startsWith("N");
        final long countFriendsStartNn =
                friends.stream()
                        .filter(startsWithN)
                        .count();
        final long countEditorsStartNn =
                editors.stream()
                        .filter(startsWithN)
                        .count();
        final long countComradesStartN =
                comrades.stream()
                        .filter(startsWithN)
                        .count();
//Rather than duplicate the lambda expression several times, you created it once and stored it in
// a reference named startsWithN of type Predicate. In the three calls to the filter() method, the Java compiler happily took
// the lambda expression stored in the variable under the guise of the Predicate instance.

    }
}
