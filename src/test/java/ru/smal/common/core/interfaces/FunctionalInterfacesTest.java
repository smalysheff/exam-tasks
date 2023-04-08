package ru.smal.common.core.interfaces;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FunctionalInterfacesTest {


    /**
     * Predicate<T> predicate = new Predicate<T>() {
     *         @Override
     *         public boolean test(T s) {
     *             return false;
     *         }
     *     };
     */
    @Test
    void predicateTest() {
        Predicate<String> predicate = String::isEmpty;
        assertTrue(predicate.test(""));
    }

    /**
     * Consumer<T> consumer = new Consumer<T>() {
     *         @Override
     *         public void accept(T s) {
     *
     *         }
     *     };
     */
    @Test
    void consumerTest() {
        Consumer<List<String>> consumer = list -> list.add("one");
        List<String> actual = new ArrayList<>();
        consumer.accept(actual);

        assertEquals(List.of("one"), actual);
    }

    /**
     * Supplier<T> supplier = new Supplier<T>() {
     *         @Override
     *         public T get() {
     *             return null;
     *         }
     *     };
     */
    @Test
    void supplierTest() {
        record CustomException(String message) {
            public CustomException() {
                this("exception");
            }
        }
        Supplier<CustomException> supplier = () -> new CustomException("custom message");
        Supplier<CustomException> supplier1 = CustomException::new;

        assertEquals("custom message", supplier.get().message());
        assertEquals("exception", supplier1.get().message());
    }

    /**
     * Function<T, D> function = new Function<T, D>() {
     *         @Override
     *         public D apply(T s) {
     *             return null;
     *         }
     *     };
     */
    @Test
    void functionTest() {
        Function<String, Integer> mapToInt = Integer::parseInt;
        Function<Integer, Integer> mapSum = num -> num + 10;

        assertEquals(10, mapToInt.apply("10"));
        assertEquals(20, mapSum.apply(10));
    }

    @Test
    void functionMapTest() {
        record Person(String firstName, String lastName) {}
        record PersonDto(String fullName) {}
        class PersonMapper {
            public PersonDto map(Person person) {
                String fullName = getFullName(person);
                return new PersonDto(fullName);
            }
            public Person map(PersonDto personDto) {
                String[] fullName = personDto.fullName().split(" ");
                return new Person(fullName[0], fullName[1]);
            }
            public PersonDto map(Person person,  String message) {
                return new PersonDto(message + " " + getFullName(person));
            }

            private String getFullName(Person person) {
                return person.firstName() + " " + person.lastName();
            }
        }

        PersonMapper mapper = new PersonMapper();

        Function<Person, PersonDto> mapToPersonDto = mapper::map;
        Function<PersonDto, Person> mapToPerson = mapper::map;

        assertEquals("James Gosling", mapToPersonDto.apply(new Person("James", "Gosling")).fullName());
        assertEquals("James", mapToPerson.apply(new PersonDto("James Gosling")).firstName());
        assertEquals("Gosling", mapToPerson.apply(new PersonDto("James Gosling")).lastName());

        // BiFunctionTest
        BiFunction<Person, String, PersonDto> biFunction = mapper::map;

        assertEquals("Hello James Gosling", biFunction.apply(new Person("James", "Gosling"), "Hello").fullName());
    }

    /**
     * UnaryOperator<T> unaryOperator = new UnaryOperator<T>() {
     *         @Override
     *         public T apply(T s) {
     *             return null;
     *         }
     *     };
     */
    @Test
    void unaryOperatorTest() {
        UnaryOperator<String> unaryOperator = str -> str.concat("java");

        assertEquals("Hello java", unaryOperator.apply("Hello "));
    }

    /**
     * BinaryOperator<T> binaryOperator = new BinaryOperator<T>() {
     *         @Override
     *         public T apply(T s, T s2) {
     *             return null;
     *         }
     *     };
     */
    @Test
    void binaryOperatorTest() {
        BinaryOperator<Integer> sum = Integer::sum;
        BinaryOperator<Integer> max = Integer::max;
        BinaryOperator<Integer> compare = Integer::compare;

        assertEquals(10, sum.apply(5, 5));
        assertEquals(10, max.apply(5, 10));
        assertEquals(-1, compare.apply(5, 10));
        assertEquals(0, compare.apply(5, 5));
        assertEquals(1, compare.apply(10, 5));
    }
}