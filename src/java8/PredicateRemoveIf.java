package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateRemoveIf {

    public static void predicateTest() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 8, 18, 33, 99, 120, 211, 244));
        List<Integer> integers = numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

        System.out.println(integers);
        numbers.removeIf(i -> i % 2 != 0);
        System.out.println("numbers = " + numbers);
    }

    public static void predicateTest1() {

        Predicate<Integer> isOdd = i -> i % 2 != 0;
        Predicate<Integer> isDivBy3 = i -> i % 3 == 0;

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 8, 18, 33, 99, 120, 211, 244));
        List<Integer> integers = numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

        System.out.println(integers);
        numbers.removeIf(isOdd.or(isDivBy3));
        System.out.println("numbers = " + numbers);

    }


    public static void main(String[] args) {

        predicateTest1();
    }
}
