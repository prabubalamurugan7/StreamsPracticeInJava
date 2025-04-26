package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {


    public static void main(String[] args){

        List<String> listString = new ArrayList<>();
        listString.add("Prabu");
        listString.add("Karthik");
        listString.add("Vaishali");
        listString.add("Dhivya");

        //Creating Stream 1
        Stream<String> streamOfList = listString.stream();
        streamOfList.forEach(System.out::println);

        System.out.println("-------------------------------------------");

        //Creating Stream 2
        List<String> listOfString1 = Arrays.asList("Prabu", "Vaishali", "Kohli", "Rohit");
        Stream<String> streamOfList1 = listOfString1.stream();
        streamOfList1.forEach(p -> System.out.print(p + " "));

        System.out.println("\n-------------------------------------------");

        //Creating Stream 3
        Stream<Integer> integerOfStream = Stream.of(1, 2, 3, 4, 5, 6);
        integerOfStream.map(p -> p*10).forEach(p -> System.out.print(p + " "));

        System.out.println("\n-------------------------------------------");

        //Creating Stream 4
        Stream<String> stringOfStream1 = Stream.of("Prabu", "Vaishali", "Kohli", "Rohit");
        stringOfStream1.map(p -> p.toUpperCase()).sorted().forEach(System.out::println);

    }
}
