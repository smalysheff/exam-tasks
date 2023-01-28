package ru.smal.common.stream_api.common;

import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Random;
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
 * anyMatch()
 * allMatch()
 * noneMatch()
 * findFirst()
 * findAny()
 */
public class CreateStream {
    @SneakyThrows
    public void createStreams() {

        var empty = Stream.empty();

        var add = Stream.builder().add("one").add("two").add("three");

        var stringStream = Stream.of("one", "two", "three");

        var intStream = IntStream.of(1, 2, 3);

        var arrayStream = Arrays.stream(new int[]{1, 2, 3});

        var lineStream = Files.lines(Path.of("path"));
    }

    public void infinityStreams() {

        var generate = Stream.generate(() -> new Random().nextInt(3));  // limit is required


        var iterate = Stream.iterate(0, i -> i + 1);                     // limit is required
    }
}
