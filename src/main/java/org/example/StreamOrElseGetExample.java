package org.example;

import java.util.Optional;

public class StreamOrElseGetExample {

    public static void main(String[]args){

        //print();
        Optional.of("Geekific").orElseGet(() -> print());
        //this will create non-empty Optional with value Geekific since Optional
        // is non-empty, the orElseGet method will not execute the print method ,
        // and value Geekific will be used.

        Optional.empty().orElseGet(() -> print());
        //This will create empty Optional. since the Optional is empty, orElseGet
        // method will execute print method which prints like and return Subscribe.

        Optional.of("Geekific").orElse(print());
        //this will create non-empty Optional with values Geekific since
        // Optional is non-empty, the orElse method will still execute print method
        //And prints Like and return Subscribe.
        //and value Geekific will be used.

    }

    private static String print(){

        System.out.println("Like");
        return "Subscribe";

    }
}
