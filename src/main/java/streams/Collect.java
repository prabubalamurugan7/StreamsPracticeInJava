package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collect {

    public static void main(String[] args)
    {
        List<String> listOfStrings = Arrays.asList("Kohli", "Rohit", "Dhoni", "Pandya", "Ruturaj");
        Stream<String> stream = listOfStrings.stream();

        //Collect as List
        List<String> newList = stream.collect(Collectors.toList());
        for(String string : newList)
        {
            System.out.println(string);
        }

        System.out.println("=================================================");

        //Collect as Set
        Stream<String> stream1 = listOfStrings.stream();
        Set<String> setOfStrings = stream1.collect(Collectors.toSet());
        for(String string : setOfStrings)
        {
            System.out.println(string);
        }

    }
}
