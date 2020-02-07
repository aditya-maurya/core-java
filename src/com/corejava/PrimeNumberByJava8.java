package com.corejava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumberByJava8 {

    public static void main(String[] args) {

        int [] a = {3,8,7,5,44,23,29,65,77};

       List<Integer> primeNumbers2= Arrays.stream(a).filter(number -> IntStream.range(2,number)
                .noneMatch(divider -> number % divider == 0))
                .boxed()
                .collect(Collectors.toList());


        System.out.println(primeNumbers2);

        List<Integer> primeNumbers =
                IntStream
                        .range(2,30)
                        .filter(number -> IntStream.range(2,number)
                                .noneMatch(divider -> number % divider == 0))
                        .boxed()
                        .collect(Collectors.toList());

        System.out.println(primeNumbers);

    }
}
