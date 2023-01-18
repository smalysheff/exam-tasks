package ru.smal.gof_patterns.behavioral.template_method;

public class App {

    public static void main(String[] args) {
        Pipeline lorry = new LorryCar();
        Pipeline sedan = new SedanCar();

        lorry.assembly();
        System.out.println("==========================");
        sedan.assembly();
    }
}
