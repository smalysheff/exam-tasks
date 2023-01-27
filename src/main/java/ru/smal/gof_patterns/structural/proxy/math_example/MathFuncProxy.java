package ru.smal.gof_patterns.structural.proxy.math_example;

public class MathFuncProxy implements MathFunc {

    private MathFunc math;

    @Override
    public int add(int a, int b) {
        lazyInit();
        return math.add(a, b);
    }

    @Override
    public int sub(int a, int b) {
        lazyInit();
        return math.sub(a, b);
    }

    @Override
    public int mul(int a, int b) {
        lazyInit();
        return math.mul(a, b);
    }

    @Override
    public double div(int a, int b) {
        lazyInit();
        return math.div(a, b);
    }

    private void lazyInit() {
        if (math == null) {
            math = new MathFuncImpl();
        }
    }
}
