package org.example;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class StreamAvgExample {

    public static void main(String [] args){
        OptionalDouble average = Arrays.stream(new int[]{10,20,40,50,67,49}).average();
        System.out.println(average.isPresent());

        Arrays.stream(new int[]{45,67,79,45,34,92})
                .average()
                .ifPresent(System.out::println);

        OptionalInt intAverage = Arrays.stream(new int[]{10,30,50,25,60}).min();
        System.out.println(intAverage.getAsInt());

        Arrays.stream(new double[]{20.0,78,45,23,86,98,91,65}).max()
                .ifPresent(System.out::println);


    }
}
