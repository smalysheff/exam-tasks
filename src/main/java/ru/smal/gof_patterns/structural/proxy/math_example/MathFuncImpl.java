package ru.smal.gof_patterns.structural.proxy.math_example;

public class MathFuncImpl implements MathFunc {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public int mul(int a, int b) {
        return a * b;
    }

    @Override
    public double div(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a < 0 || b < 0 ? (double) (a / b) * -1 : (double) a / b;
    }
}
