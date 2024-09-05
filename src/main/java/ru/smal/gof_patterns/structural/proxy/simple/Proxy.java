package ru.smal.gof_patterns.structural.proxy.simple;

public class Proxy implements Subject {

    private Subject subject;

    @Override
    public void request() {
        init();
        System.out.println("Proxy: Logging request");
        subject.request();
        System.out.println("Proxy: Request processed");
    }

    private void init() {
        subject = new RealSubject();
    }
}
