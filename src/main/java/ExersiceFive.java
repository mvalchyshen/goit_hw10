package main.java;

import java.util.Collections;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExersiceFive {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> firstStream = first.iterator();
        Iterator<T> secondStream = second.iterator();
        Stream<T> concat = Stream.empty();
        while (firstStream.hasNext() || secondStream.hasNext()) {
            concat = Stream.concat(concat, Stream.of(firstStream.next(),secondStream.next()));
        }
        return concat.collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
            Collections.shuffle(list);
            return list.stream();
        }));
    }
}
