package com.solvd;

import java.util.List;
import java.util.Arrays;
import java.util.Set;
import java.util.Collection;
import java.util.stream.*;

import org.apache.log4j.Logger;

public class Main {

    private static final Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(4,3,2,1);
        List<String> names = Arrays.asList("Tree","Book","Stream", "Sony", "Goods" , "Screen");
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        Collection<AgePeople> sport = Arrays.asList(
                new AgePeople("Mike", 15),
                new AgePeople("Dan", 23),
                new AgePeople("Dan", 34),
                new AgePeople(null, 20),
                new AgePeople("Tom", 30),
                new AgePeople("Veronika", 19)
        );


        List<Integer> square = number.stream().map(x -> x*x).collect(Collectors.toList());
        log.info(square);

        List<String> result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
        log.info(result);

        List<String> show = names.stream().sorted().collect(Collectors.toList());
        log.info(show);

        Set<Integer> squareSet = numbers.stream().map(x->x*x).collect(Collectors.toSet());
        log.info(squareSet);

        String name = sport.stream().max((p1,p2) -> p1.getAge().compareTo(p2.getAge())).get().getName();
        log.info("Name = "+name);

        long countName =  sport.stream().filter((p) -> p.getName() != null && p.getName().equals("Dan")).count();
        log.info("countName = " + countName);

    }

}
