package ru.smal.gof_patterns.structural.proxy.math_example;

/**
    Интерфейс, содержащий базовые математические операции
 */
public interface MathFunc {

    /**
     * Возвращает сумму двух целых чисел
     * @param a - значение
     * @param b - значение
     * @return целочисленное значение
     */
    int add(int a, int b);

    /**
     * Возвращает разницу двух целых чисел
     * @param a - значение
     * @param b - значение
     * @return целочисленное значение
     */
    int sub(int a, int b);

    /**
     * Возвращает произведение двух целых чисел
     * @param a - значение
     * @param b - значение
     * @return целочисленное значение
     */
    int mul(int a, int b);

    /**
     * Возвращает результат деления двух целых чисел
     * @param a - значение
     * @param b - значение
     * @return целочисленное значение
     */
    double div(int a, int b);
}
