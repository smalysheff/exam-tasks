package ru.smal.gof_patterns.structural.proxy.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Runner {

    public static void main(String[] args) throws IOException {

        var reader = new BufferedReader(new InputStreamReader(System.in));
        var string = reader.readLine();

        Subject subject;
        if (Objects.equals(string, "Proxy")) {
            subject = new Proxy();
        } else {
            subject = new RealSubject();
        }

        subject.request();
    }
}
