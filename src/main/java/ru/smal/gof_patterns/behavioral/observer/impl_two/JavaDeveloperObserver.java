package ru.smal.gof_patterns.behavioral.observer.impl_two;

import java.util.List;

public class JavaDeveloperObserver implements Observer {

    private final String name;

    public JavaDeveloperObserver(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Hi  dear " + name + "\n" + vacancies + "\n================================\n");
    }
}
