package main.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciseThree {

    public static String numbersFromArray(String[] ar) {
        String collect = Arrays.stream(ar)
                .flatMap(element -> Arrays.stream(element.split(", ")))
                .sorted()
                .collect(Collectors.joining(", ", "", "."));
        return collect;
    }

}
