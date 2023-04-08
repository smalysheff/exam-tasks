package ru.smal.common.core.interfaces;

import java.util.function.*;


/**
 * Predicate { boolean test(T t); }
 * Consumer { void accept(T t); }
 * Supplier { T get(); };
 * Function { D apply(T t); }
 * UnaryOperator { T apply(T t); }
 * BinaryOperator { T apply(T t1, T t2); }
 */
public class FunctionalInterfaces<T, U, R> {
    Predicate<T> predicate = new Predicate<T>() {
        @Override
        public boolean test(T s) {
            return false;
        }
    };

    Supplier<T> supplier = new Supplier<T>() {
        @Override
        public T get() {
            return null;
        }
    };
    Consumer<T> consumer = new Consumer<T>() {
        @Override
        public void accept(T s) {

        }
    };
    Function<T, R> function = new Function<T, R>() {
        @Override
        public R apply(T s) {
            return null;
        }
    };
    BiFunction<T, U, R> biFunction = new BiFunction<T, U, R>() {
        @Override
        public R apply(T t, U u) {
            return null;
        }
    };
    UnaryOperator<T> unaryOperator = new UnaryOperator<T>() {
        @Override
        public T apply(T s) {
            return null;
        }
    };
    BinaryOperator<T> binaryOperator = new BinaryOperator<T>() {
        @Override
        public T apply(T s, T s2) {
            return null;
        }
    };
}
