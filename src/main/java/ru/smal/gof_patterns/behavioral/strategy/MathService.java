package ru.smal.gof_patterns.behavioral.strategy;

public class Context {

    private MathStrategy strategy;

    public Context() {}

    public Context(MathStrategy strategy) {
        this.strategy = strategy;
    }

    public double getStrategy(int a, int b) {
        return strategy.execute(a, b);
    }

    public void setStrategy(MathStrategy strategy) {
        this.strategy = strategy;
    }
}
