package org.example;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamFromArrayExample {

    public static void main(String []args){

        Integer[] array = {20,30,19,-45,90};
        Stream<Integer> streamFromArray = Arrays.stream(array);
        //streamFromArray.forEach(System.out::print);
        streamFromArray.forEach(n -> System.out.print(n+","));
    }
}
