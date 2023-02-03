package ru.smal.common.core.stream_api.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

class CreateStreamTest {

    @Test
    void createStreams() {

    }

    @Test
    void infinityStreams() {
        // Stream iterate
        Stream<Integer> iterate = Stream.iterate(0, i -> i + 1);
        List<Integer> actual = iterate
                .limit(5)
                .toList();

        Assertions.assertThat(actual).isEqualTo(List.of(0, 1, 2, 3, 4));

        // Stream generate
        Stream<Object> generate = Stream.generate(() -> new Random().nextInt(100));
        List<Object> objects = generate
                .limit(3)
                .toList();

        System.out.println(objects);
    }
}