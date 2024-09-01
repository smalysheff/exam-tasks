package ru.smal.multitreading.task1;

public class Printer {

    public volatile int counter;

    public Printer() {
    }

    public void first(Runnable printFirst) {
        printFirst.run();
        counter++;
    }

    public void second(Runnable printSecond) {
        while (true) {
            if (counter == 1) {
                printSecond.run();
                counter++;
            }
        }
    }

    public void third(Runnable printThird) {
        while (true) {
            if (counter == 3) {
                printThird.run();
            }
        }
    }
}
