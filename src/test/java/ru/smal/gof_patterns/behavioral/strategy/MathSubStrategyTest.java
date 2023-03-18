package ru.smal.gof_patterns.behavioral.strategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathSubStrategyTest {

    private MathSubStrategy strategy;

    @BeforeEach
    void setUp() {
        strategy = new MathSubStrategy();
    }

    @Test
    void execute() {
        assertEquals(10, strategy.execute(11, 1));
        assertEquals(0, strategy.execute(10, 10));
    }
}