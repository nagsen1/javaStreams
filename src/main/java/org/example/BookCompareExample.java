package org.example;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class BookCompareExample {

    public static void main(String []args){

        Book lordOfTheRings = new Book("The Lord of the Rings", "J.R.R. Tolkin", 60.0);
        Book hobbit = new Book("The Hobbit", "J.R.R. Tolkin", 40.0);
        Book harryPotter = new Book("Harry Potter", "J.K. Rowling", 20.0);
        Book daVinciCode = new Book("Da Vinci Code", "Dan Brown", 30.0);
        Book gameOfThrones = new Book("A song of Ice and Fire", "G.R.R. Martin", 50.0);

        Stream<Book> books = Stream.of(lordOfTheRings,hobbit,harryPotter,daVinciCode,gameOfThrones);

/*        Optional<Book> mostExpensiveBook = books
                .max(Comparator.comparing(Book::price));

        System.out.println(mostExpensiveBook.get());*/
        System.out.println("\n-------------------");

/*        Optional<Book> mostCheapBook = books
                .min(Comparator.comparing(Book::price));
        System.out.println(mostCheapBook.get());*/

/*         books
                .min(Comparator.comparing(Book::title))
                .ifPresent(System.out::print);*/

/*         books
                 .min(Comparator.comparing(Book::author))
                 .ifPresent(System.out::print);*/
        //ifPresent
/*        books
                .max(Comparator.comparing(Book::author))
                .ifPresent(System.out::print);*/

        //orElse

/*        Book book = books
                .max(Comparator.comparing(Book::price))
                .orElse(hobbit);
        System.out.println(book);*/

        //orElseThrow

/*        try {
            Book book = books
                    .max(Comparator.comparing(Book::price))
                    .orElseThrow(Exception::new);
            System.out.println(book);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }*/

        // orElseGet

        Book book = books
                .max(Comparator.comparing(Book::price))
                .orElseGet(() -> hobbit)
                ;
        System.out.println(book);
    }
}
