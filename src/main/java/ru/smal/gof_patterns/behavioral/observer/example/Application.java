package ru.smal.gof_patterns.behavioral.observer.example;

import java.io.File;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        File file = new File("src/main/resources/Button.txx");

        FileListener fileListener = new FileListener(file);
        ButtonListener buttonListener = new ButtonListener();

        KeyButtonObservable publish = new KeyButtonObservable();
        publish.subscribe(buttonListener);
        publish.subscribe(fileListener);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text for observers: ");
        String string;

        while (!(string = scanner.nextLine()).equals("stop")) {
            publish.updateMessage(string);
        }


    }


}
