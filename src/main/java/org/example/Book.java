package org.example;

import java.util.stream.Stream;

public record Book(String title, String author, double price) {

    static Stream<Book> getBookStream() {
        Book lordOfTheRings = new Book("The Lord of the Rings", "J.R.R. Tolkin", 60.0);
        Book hobbit = new Book("The Hobbit", "J.R.R. Tolkin", 40.0);
        Book harryPotter = new Book("Harry Potter", "J.K. Rowling", 20.0);
        Book daVinciCode = new Book("Da Vinci Code", "Dan Brown", 30.0);
        Book gameOfThrones = new Book("A song of Ice and Fire", "G.R.R. Martin", 50.0);

        Stream<Book> books = Stream.of(lordOfTheRings, hobbit, harryPotter, daVinciCode, gameOfThrones);
        return books;
    }
}
