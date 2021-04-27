package main.java;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciseTwo {
    public static String upperCaseAndReverseOrder(List<String> line) {
        String collect = line.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(", ", "", "."));
        return collect;
    }
}
