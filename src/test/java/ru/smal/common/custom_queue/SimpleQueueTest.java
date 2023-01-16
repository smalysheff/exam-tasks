package ru.smal.common.custom_queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleQueueTest {

    @Test
    void add() {
        SimpleQueue<String> queue = new SimpleQueue<>();
        queue.add("item");

        assertFalse(queue.isEmpty());
        assertEquals("item", queue.remove());
    }

    @Test
    void remove() {
        SimpleQueue<String> queue = new SimpleQueue<>();
        queue.add("item");

        assertFalse(queue.isEmpty());
        assertEquals("item", queue.remove());
        assertTrue(queue.isEmpty());
    }

    @Test
    void isEmpty() {
        SimpleQueue<String> queue = new SimpleQueue<>();
        queue.add("item");

        assertFalse(queue.isEmpty());
        assertTrue(new SimpleQueue<String>().isEmpty());

    }
}