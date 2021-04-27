package main.java;

import java.util.List;
import java.util.stream.Collectors;

public class ExerciseOne {


    public static String names(List<String> names) {
        String collect = names.stream()
                .filter(name -> names.indexOf(name) % 2 != 0)
                .map(name -> names.indexOf(name) + ". " + name)
                .collect(Collectors.joining(", ", "", "."));
        return collect;
    }
}
