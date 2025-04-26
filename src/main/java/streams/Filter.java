package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Filter {

    public static void main(String[] args)
    {
        List<String> listOfString = Arrays.asList("Kohli", "Rohit", "Pandya", "Dhoni", "Curran", "Overton");

        //Filter - Length more than 5
        Stream<String> streamOfString = listOfString.stream();
        streamOfString.filter(p -> p.length() > 5).forEach(System.out::println);

        System.out.println("=================================================================");

        //Filter - StartsWith D
        Stream<String> streamOfString1 = listOfString.stream();
        streamOfString1.filter(p -> p.startsWith("D")).forEach(System.out::println);

        System.out.println("=================================================================");

        //Filter - StartsWith O in Uppercase
        Stream<String> streamOfString2 = listOfString.stream().sorted();
        streamOfString2.filter(p -> p.toUpperCase().startsWith("O")).forEach(System.out::println);

        System.out.println("=================================================================");

        //Filter - EndsWith n in Uppercase
        Stream<String> streamOfString3 = listOfString.stream().sorted();
        streamOfString3.filter(p -> p.toUpperCase().endsWith("N")).forEach(System.out::println);


    }
}
