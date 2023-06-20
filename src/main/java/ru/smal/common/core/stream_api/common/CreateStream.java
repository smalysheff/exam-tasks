package ru.smal.common.core.stream_api.common;

import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.IntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * =========== Intermediate Operations ===========
 * <p>
 * filter()
 * map()
 * flatMap()
 * distinct()
 * sorted()
 * peek()
 * limit()
 * skip()
 * generate()
 * iterate()
 * range()
 * summaryStatistics()
 * <p>
 * <p>
 * =========== Terminal Operations ===========
 * <p>
 * forEach()
 * forEachOrdered()
 * toArray()
 * reduce()
 * collect()
 * min()
 * max()
 * count()
 * sum()
 * anyMatch()
 * allMatch()
 * noneMatch()
 * findFirst()
 * findAny()
 */
public class CreateStream {
    @SneakyThrows
    public void createStreams() {

        var stream1 = Stream.empty();
        var stream2 = Stream.of("one", "two", "three");
        var stream3 = Stream.builder().add("one").add("two").add("three");
        var stream5 = IntStream.of(1, 2, 3);
        var stream4 = List.of("one", "two", "three").stream();
        var stream6 = Arrays.stream(new int[]{1, 2, 3});
        var stream7 = Files.lines(Path.of("path"));
    }

    public void infinityStreams() {
        var generate = Stream.generate(() -> new Random().nextInt(3)).limit(100);  // limit is required
        var iterate = Stream.iterate(0, i -> i + 1).limit(100);                     // limit is required
        var range = IntStream.range(0, 100);
    }

    private void intermediateOperations() {
//        Stream.of("")
//                .generate()
//                .iterate()
//                .limit(Long)
//                .skip(Long)
//                .filter(Predicate)
//                .map(Function)
//                .flatMap(Function)
//                .sorted(Comparator)
//                .peek(Consumer)
//                .distinct()

//        IntStream
//                .range()
//                .summaryStatistics()
    }

    private void terminatedOperations() {
//        Stream.of("")
//                .forEach(Consumer)
//                .forEachOrdered(Consumer)
//                .toArray(IntFunction)
//                .reduce(BinaryOperator)
//                .collect(Collector/Supplier)
//                .min(Comparator)
//                .max(Comparator)
//                .anyMatch(Predicate)
//                .allMatch(Predicate)
//                .noneMatch(Predicate)
//                .findFirst()
//                .findAny()
//                .sum()
//                .count()
    }
}
