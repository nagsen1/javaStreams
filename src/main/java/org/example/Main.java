package org.example;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Ways to create stream

        Stream<Integer> stream = Stream.of(20,10,-40, 80,30,-90);

        IntStream stream1 = IntStream.of(20,10,-40,80,30,-90);

        IntStream stream2 = IntStream.range(1,10);
        stream2.forEach(System.out::print);

        System.out.println("\n----------------------------");

        IntStream stream3 = IntStream.rangeClosed(1,10);
        stream3.forEach(System.out::print);

        System.out.println("\n----------------------------");

        Stream<String> stream4 = Stream.<String>builder().add("Absolute").add("Right").add("Left").add("Center").build();
        stream4.forEach(System.out::println);

        System.out.println("\n----------------------------");

        //Obtain a stream from an existing array

        Integer[] array = {20,10,-50,80,30,-90};

        Stream<Integer> streamFromArray = Arrays.stream(array);
        streamFromArray.forEach(System.out::print);

        System.out.println("\n----------------------------");

        //Obtaining a stream from an existing List

        List<Integer> list = Arrays.asList(array);
        Stream<Integer> streamFromList = list.stream();
        streamFromList.forEach(System.out::print);

        System.out.println("\n----------------------------");

        Book lordOfTheRings = new Book("The Lord of the Rings", "J.R.R. Tolkin", 60.0);
        Book hobbit = new Book("The Hobbit", "J.R.R. Tolkin", 40.0);
        Book harryPotter = new Book("Harry Potter", "J.K. Rowling", 20.0);
        Book daVinciCode = new Book("Da Vinci Code", "Dan Brown", 30.0);
        Book gameOfThrones = new Book("A song of Ice and Fire", "G.R.R. Martin", 50.0);

        Stream<Book> books = Stream.of(lordOfTheRings,hobbit,harryPotter,daVinciCode,gameOfThrones);

        //Long count = books.count();

        Optional<Book> mostExpensiveBook = books.max(Comparator.comparing(Book::price));
        System.out.println(mostExpensiveBook.get().title());

    }
}