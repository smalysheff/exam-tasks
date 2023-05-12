package ru.smal.common.custom_queue;

import org.junit.jupiter.api.Test;
import ru.smal.common.custom_collection.custom_queue.Queue;
import ru.smal.common.custom_collection.custom_queue.SimpleQueue;

import static org.junit.jupiter.api.Assertions.*;

class SimpleQueueTest {

    @Test
    void addAndRemove() {
        Queue<String> queue = buildQueue();

        assertFalse(queue.isEmpty());
        assertEquals("item1", queue.remove());
        assertEquals("item2", queue.remove());
        assertTrue(queue.isEmpty());
    }

    @Test
    void isEmpty() {
        Queue<String> queue = buildQueue();

        assertFalse(queue.isEmpty());
        assertTrue(new SimpleQueue<String>().isEmpty());

    }

    private Queue<String> buildQueue() {
        SimpleQueue<String> queue = new SimpleQueue<>();

        queue.add("item1");
        queue.add("item2");

        return queue;
    }
}