package ru.smal.gof_patterns.structural.proxy.math_example;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MathFuncImplTest {

    private MathFunc math;

    @BeforeEach
    void setUp() {
        math = new MathFuncProxy();
    }

    @Test
    void add() {
        assertThat(4).isEqualTo(math.add(2, 2));
        assertThat(-8).isEqualTo(math.add(-5, -3));
    }

    @Test
    void sub() {
        assertThat(4).isEqualTo(math.sub(8, 4));
        assertThat(1).isEqualTo(math.sub(0, -1));
    }

    @Test
    void mul() {
        assertThat(32).isEqualTo(math.mul(8, 4));
        assertThat(0).isEqualTo(math.mul(0, -1));
    }

    @Test
    void div() {
        assertThat(2.0).isEqualTo(math.div(8, 4));
        assertThat(0.0).isEqualTo(math.div(0, -1));
        assertThat(0.0).isEqualTo(math.div(10, 0));
    }
}