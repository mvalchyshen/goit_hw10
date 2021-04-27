package main.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Max", "Vadym", "Valya", "Ihor", " Ira");
        List<String> strings = Arrays.asList("Vova", "Hova", "Jaba", "Vlada", "Olya");
        String[] ar = {"1, 2, 0", "4, 5"};
        System.out.println(ExerciseOne.names(names));
        System.out.println(ExerciseTwo.upperCaseAndReverseOrder(names));
        System.out.println(ExerciseThree.numbersFromArray(ar));
        new ExerciseFour(25214903917L,11L ,2^48L,10,10);
        System.out.println(ExersiceFive.zip(names.stream(), strings.stream()).collect(Collectors.toList()));
    }
}
