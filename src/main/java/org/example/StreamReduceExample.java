package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.example.Book.getBookStream;

public class StreamReduceExample {

    public static void main(String[] args) {

        Integer sumOfInteger = Stream.of(20, -34, 67, 89, -96, 23)
                .reduce(0, Integer::sum);
        System.out.println(sumOfInteger);

        List<String> letters = Arrays.asList("p", "r", "i", "n", "c", "e");
        String result = letters.stream().reduce("", String::concat);
        System.out.println(result.toUpperCase());

        //

        Stream<Book> books = getBookStream();
        double total = books
                .reduce(0.0, (cumulative, book) -> cumulative + book.price(), Double::sum);
        System.out.println(total);
    }


}