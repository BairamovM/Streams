package com.solvd;

import java.util.List;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.*;

import org.apache.log4j.Logger;

public class Main {

    private static final Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(4,3,2,1);
        List<String> names = Arrays.asList("Tree","Book","Stream", "Sony", "Goods" , "Screen");
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);


        List<Integer> square = number.stream().map(x -> x*x).collect(Collectors.toList());
        log.info(square);

        List<String> result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
        log.info(result);

        List<String> show = names.stream().sorted().collect(Collectors.toList());
        log.info(show);

        Set<Integer> squareSet = numbers.stream().map(x->x*x).collect(Collectors.toSet());
        log.info(squareSet);

        number.stream().map(x->x*x).forEach(y->log.info(y));

    }

}
