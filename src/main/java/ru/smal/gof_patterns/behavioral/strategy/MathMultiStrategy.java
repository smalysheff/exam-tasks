package ru.smal.gof_patterns.behavioral.strategy;

public class MathMultiStrategy implements MathStrategy {
    @Override
    public double execute(int a, int b) {
        return a * b;
    }
}
