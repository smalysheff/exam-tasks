package ru.smal.gof_patterns.behavioral.template_method;

import ru.smal.common.custom_stack.Stack;

public abstract class Pipeline {
    public void assembly() {
        System.out.println("Car body");
        System.out.println("Transmission");
        engineType();

        new java.util.Stack<>().peek();



    }

    abstract void engineType();
}
