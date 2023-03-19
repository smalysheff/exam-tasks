package ru.smal.gof_patterns.behavioral.strategy;

public class MathService {

    private MathStrategy strategy;

    public MathService() {}

    public MathService(MathStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculate(int a, int b) {
        return strategy.execute(a, b);
    }

    public void setStrategy(MathStrategy strategy) {
        this.strategy = strategy;
    }
}
