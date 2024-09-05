package ru.smal.gof_patterns.structural.proxy.simple;

public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("RealSubject: Handling request");
    }
}
