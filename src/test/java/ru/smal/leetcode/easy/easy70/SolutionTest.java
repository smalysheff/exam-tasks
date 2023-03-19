package ru.smal.leetcode.easy.easy70;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.smal.leetcode.easy.easy70.Solution;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class SolutionTest {

    @InjectMocks
    private Solution solution;

    @Test
    void climbStairsRecursion() {
        assertEquals(1, solution.climbStairsRecursion(1));
        assertEquals(2, solution.climbStairsRecursion(2));
        assertEquals(3, solution.climbStairsRecursion(3));
        assertEquals(8, solution.climbStairsRecursion(5));
    }

    @Test
    void climbStairsForLoop() {
        assertEquals(1, solution.climbStairsForLoop(1));
        assertEquals(2, solution.climbStairsForLoop(2));
        assertEquals(3, solution.climbStairsForLoop(3));
        assertEquals(8, solution.climbStairsForLoop(5));
        assertEquals(1836311903, solution.climbStairsForLoop(45));
    }
}