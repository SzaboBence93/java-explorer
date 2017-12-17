package com.company;

import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        int neszeTe = IntStream.range(1,10)
                .filter(i -> i%2 == 0)
                .map(i -> i*i)
                .reduce(0, (i1, i2) -> i1 + 2*i2);
                //.collect(Integer::new, Integer::sum, Integer::);

        System.out.println(neszeTe);
        //System.out.println(neszeTe.orElseThrow(RuntimeException::new));
        int sum = 0;
        for(int i = 2; i < 10; i += 2){
            sum += 2*i*i;
        }
        System.out.println(sum);
    }

}