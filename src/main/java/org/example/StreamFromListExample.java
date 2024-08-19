package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFromListExample {

    public static void main(String []args){
        List<Integer> list = Arrays.asList(10,20,30,50,55,98);
        Stream<Integer> streamFromList = list.stream();
        streamFromList.forEach(n -> System.out.print(n + ","));

        Integer[] array = {34,67,54,87,53,21,34};
        List<Integer> list1 = Arrays.asList(array);
        Stream<Integer> streamFromArrayToList = list1.stream();
        streamFromArrayToList.forEach(n -> System.out.print(n + ","));


    }
}
