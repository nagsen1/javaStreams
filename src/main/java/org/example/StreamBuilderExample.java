package org.example;

import java.util.stream.Stream;

public class StreamBuilderExample {

    public static void main(String []args){
        Stream<String> stream = Stream.<String>builder()
                .add("1")
                .add("2")
                .add("3")
                .add("4")
                .build();
        stream.forEach(System.out::println);

    }
}
