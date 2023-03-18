package ru.smal.gof_patterns.behavioral.strategy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class ContextTest {

    @InjectMocks
    private Context context;

    @Test
    void getStrategyAdd() {
        context.setStrategy(new MathAddStrategy());
        assertEquals(9, context.getStrategy(4, 5));
    }

    @Test
    void getStrategyMulti() {
        context.setStrategy(new MathMultiStrategy());
        assertEquals(20, context.getStrategy(4, 5));
    }

    @Test
    void getStrategySub() {
        context.setStrategy(new MathSubStrategy());
        assertEquals(-1, context.getStrategy(4, 5));
    }
}