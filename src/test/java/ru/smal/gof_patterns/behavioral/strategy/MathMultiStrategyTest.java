package ru.smal.gof_patterns.behavioral.strategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathMultiStrategyTest {

    private MathMultiStrategy strategy;

    @BeforeEach
    void setUp() {
        strategy = new MathMultiStrategy();
    }

    @Test
    void execute() {
        assertEquals(25.0, strategy.execute(5, 5));
        assertEquals(36.0, strategy.execute(6, 6));
    }
}