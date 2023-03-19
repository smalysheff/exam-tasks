package ru.smal.gof_patterns.behavioral.strategy;

public class Runner {

    public static void main(String[] args) {
        MathService service = new MathService();

        // Source data
        int a = 5;
        int b = 4;

        // Add
        service.setStrategy(new MathAddStrategy());
        var add = service.calculate(a, b);
        System.out.printf("%d + %d = %.0f\n", a, b, add);

        // Sub
        service.setStrategy(new MathSubStrategy());
        var sub = service.calculate(a, b);
        System.out.printf("%d - %d = %.0f\n", a, b, sub);

        // Multiply
        service.setStrategy(new MathMultiStrategy());
        var multiply = service.calculate(a, b);
        System.out.printf("%d * %d = %.0f\n", a, b, multiply);
    }
}
