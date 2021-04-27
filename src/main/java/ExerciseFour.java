package main.java;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExerciseFour {
    public ExerciseFour(long a, long c, long m, long seed, int limit) {
        System.out.println(random(a,c,m,seed)
                .limit(limit)
                .collect(Collectors.toList()));
    }


    private Stream<Long> random(long a, long c, long m, long seed) {
        boolean calculate = isCalculated(a,c,m,seed);
        if (calculate) {
            return Stream.iterate(seed, x -> ((a * x + c) % m));
        } else {
            throw new IllegalArgumentException();
        }
    }

    private boolean isCalculated(long a, long c, long m, long seed) {
        boolean calculate = false;
        if (a>= 0 && a < m) {
            calculate = true;
        }
        if (c>=0 && c<m) {
            calculate = true;
        }
        if (seed >= 0 && seed < m) {
            calculate = true;
        }
        return calculate;
    }
}
