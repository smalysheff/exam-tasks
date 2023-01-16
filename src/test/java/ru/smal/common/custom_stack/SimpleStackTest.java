package ru.smal.common.custom_stack;

import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class SimpleStackTest {

    @Test
    void pushTest() {
        Stack<String> stack = buildStack();

        assertFalse(stack.isEmpty());
        assertEquals("item2", stack.pop());
        assertEquals("item1", stack.pop());
        assertTrue(stack.isEmpty());

    }

    @Test
    void popSuccessTest() {
        Stack<String> stack = buildStack();

        assertFalse(stack.isEmpty());
        assertEquals("item2", stack.pop());
        assertEquals("item1", stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    void popExceptionTest() {
        assertThrows(EmptyStackException.class, () -> new SimpleStack<String>().pop());
    }

    @Test
    void isEmptyTest() {
        Stack<String> stack = buildStack();

        assertFalse(stack.isEmpty());
        assertTrue(new SimpleStack<String>().isEmpty());
    }

    private Stack<String> buildStack() {
        Stack<String> stack = new SimpleStack<>();

        stack.push("item1");
        stack.push("item2");

        return stack;
    }
}