package ru.smal.gof_patterns.behavioral.observer.example;

public class ButtonListener implements Observer<String> {

    @Override
    public void update(String o) {
        System.out.println("ButtonListener: " + o);
    }
}
