package ru.smal.multitreading;

import java.util.concurrent.atomic.AtomicInteger;

public class MemoryReorderingExample {

    private AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        for (int i = 0; i < 10_000; i++) {
            count.incrementAndGet();
        }
    }

    public static void main(String[] args) {
        var example = new MemoryReorderingExample();

        Thread t1 = new Thread(example::increment);
        Thread t2 = new Thread(example::increment);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(example.count);

    }
}
