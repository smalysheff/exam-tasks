package ru.smal.gof_patterns.behavioral.strategy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class MathServiceTest {

    @InjectMocks
    private MathService mathService;

    @Test
    void getStrategyAdd() {
        mathService.setStrategy(new MathAddStrategy());
        assertEquals(9, mathService.calculate(4, 5));
    }

    @Test
    void getStrategyMulti() {
        mathService.setStrategy(new MathMultiStrategy());
        assertEquals(20, mathService.calculate(4, 5));
    }

    @Test
    void getStrategySub() {
        mathService.setStrategy(new MathSubStrategy());
        assertEquals(-1, mathService.calculate(4, 5));
    }
}