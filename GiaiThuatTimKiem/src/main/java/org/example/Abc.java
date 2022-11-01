package org.example;

import java.io.Serial;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Abc {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,7,3,9,2,6,3);
        Optional<List<Integer>> optional = Optional.ofNullable(list);
        System.out.println(list.stream().map()filter(s -> s>5).collect(Collectors.toList()));
        Stream<String> stream = Stream.of("Java", "C#", "C++", "PHP", "Javascript");



    }
}
