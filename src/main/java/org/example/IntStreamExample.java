package org.example;

import java.util.stream.IntStream;

public class IntStreamExample {

    public static void main(String[]args){

        IntStream stream = IntStream.range(1,10);
        stream.forEach(System.out::print);

        System.out.println("\n------------");

        IntStream stream1 = IntStream.rangeClosed(1,10);
        stream1.forEach(System.out::print);

    }
}
