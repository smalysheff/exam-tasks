package ru.smal.common.core.interfaces;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FunctionalInterfacesTest {

    /**
     * Predicate<T> predicate = new Predicate() {
     *      @Override
     *      public boolean test(T t) {
     *          return null;
     *      }
     * }
     */
    @Test
    void predicateTest() {
        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNumber = str -> str.matches("\\d+");

        assertTrue(isEmpty.test(""));
        assertTrue(isNumber.test("11"));
        assertFalse(isNumber.test("1s1"));

        // Use stream
        assertTrue(Stream.of("11", "22", "33").allMatch(isNumber));
    }

    /**
     * Consumer<T> consumer = new Consumer<>() {
     *      @Override
     *      public void accept(T t) {
     *
     *      }
     *  }
     */
    @Test
    void consumerTest() {
        Consumer<List<String>> consumer = list -> list.add("java");
        List<String> list = new ArrayList<>();
        consumer.accept(list);

        assertEquals(List.of("java"), list);

        // Use stream
        List<String> source = List.of("one", "two", "three");
        List<String> result = new ArrayList<>();

        // experimental
        source.forEach(result::add);

        assertEquals(source, result);
    }

    /**
     * Supplier<T> supplier = new Supplier<>() {
     *      @Override
     *      public T get() {
     *          return null;
     *      }
     * }
     */
    @Test
    void supplierTest() {
        Supplier<String> stringSupplier = String::new;
        Supplier<StringBuilder> stringBuilderSupplier = () -> new StringBuilder("java");

        assertEquals("", stringSupplier.get());
        assertEquals("java", stringBuilderSupplier.get().toString());

        // Use stream


//        assertEquals("avajolleH", result);
    }

    /**
     * Function<T, R> function = new Function<>() {
     *      @Override
     *      public R apply(T t) {
     *          return null;
     *      }
     * }
     */
    @Test
    void functionTest() {

    }

    /**
     * UnaryOperator<T> unaryOperator = new UnaryOperator<>() {
     *      @Override
     *      public T apply(T t) {
     *          return null
     *      }
     * }
     */
    @Test
    void unaryOperatorTest() {

    }

    /**
     * BinaryOperator<T> binaryOperator = new BinaryOperator<>() {
     *      @Override
     *      public T apply(T t1, T t2) {
     *          return null;
     *      }
     * }
     */
    @Test
    void binaryOperatorTest() {

    }
}