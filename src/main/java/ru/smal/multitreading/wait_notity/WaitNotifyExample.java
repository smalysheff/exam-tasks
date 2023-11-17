package ru.smal.multitreading.wait_notity;

import java.util.ArrayList;
import java.util.List;

public class WaitNotifyExample {

    public static void main(String[] args) {

        while (true);

//        BlockingQueue queue = new BlockingQueue();
//
//        Thread worker = new Thread(() -> {
//            while (true) {
//                Runnable task = queue.get();
//                task.run();
//            }
//        });
//
//        worker.start();
//
//        for (int i = 0; i < 10; i++) {
//            queue.put(getTask());
//        }

    }

    private static Runnable getTask() {
        return () -> {
            System.out.println("Start task");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Stop task");
        };
    }
}

class BlockingQueue {

    private final List<Runnable> tasks;

    BlockingQueue() {
        this.tasks = new ArrayList<>();
    }

    public synchronized Runnable get() {
        while (tasks.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        Runnable task = tasks.get(0);
        tasks.remove(0);
        return task;
    }

    public synchronized void put(Runnable task) {
        tasks.add(task);
        notify();
    }
}
