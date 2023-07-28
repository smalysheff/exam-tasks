package ru.smal.gof_patterns.behavioral.observer.gof;

public class ClientRunner {

    public static void main(String[] args) {
        ConcreteSubject publisher = new ConcreteSubject("Hello World!");
        publisher.subscribe(new ConcreteObserverA());
        publisher.subscribe(new ConcreteObserverB());

        publisher.notifyObservers();

        publisher.updateMessage("Java OOP");
    }
}
