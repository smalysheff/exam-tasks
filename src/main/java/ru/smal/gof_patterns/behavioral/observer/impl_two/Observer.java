package ru.smal.gof_patterns.behavioral.observer.impl_two;

import java.util.List;

public interface Observer {

    void handleEvent(List<String> vacancies);
}
