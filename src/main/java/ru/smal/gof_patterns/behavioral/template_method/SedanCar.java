package ru.smal.gof_patterns.behavioral.template_method;

public class SedanCar extends Pipeline {
    @Override
    void engineType() {
        System.out.println("Engine type: gasoline");
    }
}
