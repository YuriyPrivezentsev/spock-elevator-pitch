package com.sabre.solvit.spock.elevator.calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathCalcTest {

    private MathCalc calculator = new MathCalc();

    @Test
    void sum() {
        Double sum = calculator.sum(2.5, 3.);
        Assertions.assertEquals(5.5, sum.doubleValue());
    }
}