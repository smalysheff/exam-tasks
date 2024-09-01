package ru.smal.t_task;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BackslashRemoveTest {

    private BackslashRemove backslashRemove;

    @BeforeEach
    void setUp() {
        backslashRemove = new BackslashRemove();
    }

    @ParameterizedTest
    @MethodSource("provideString")
    void testCleanStringWithNullInput(String input, String expectedOutput) {
        String actualOutput = backslashRemove.cleanString(input);

        assertEquals(expectedOutput, actualOutput);
    }

    private static Stream<Arguments> provideString() {
        return Stream.of(
                Arguments.of("Hello#World", "HellWorld"),
                Arguments.of("H#elloWorld", "elloWorld"),
                Arguments.of("", ""),
                Arguments.of("#####", "")
        );
    }
}