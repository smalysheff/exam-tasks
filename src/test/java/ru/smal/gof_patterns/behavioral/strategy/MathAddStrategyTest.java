package ru.smal.gof_patterns.behavioral.strategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAddStrategyTest {

    private MathAddStrategy strategy;

    @BeforeEach
    void setUp() {
        strategy = new MathAddStrategy();
    }

    @Test
    void execute() {
        assertEquals(4.0, strategy.execute(2, 2));
        assertEquals(0.0, strategy.execute(0, 0));
    }
}