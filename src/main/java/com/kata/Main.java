package com.kata;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static com.kata.FizzBuzz.frequencies;
import static com.kata.FizzBuzz.fizzBuzz;

public class Main
{
    public static void main( String[] args ) {
        System.out.println( "FizzBuzz" );
        List<Integer> list = IntStream.range(1,21).distinct().boxed().collect(Collectors.toList());
        String fizzBuzzOutput = fizzBuzz(list);
        Map<String, Long> frequencies = frequencies(fizzBuzzOutput);
        System.out.println(fizzBuzzOutput);
        System.out.println("fizz: " + frequencies.get("fizz").intValue());
        System.out.println("buzz: " + frequencies.get("buzz").intValue());
        System.out.println("fizzbuzz: " + frequencies.get("fizzbuzz").intValue());
    }
}