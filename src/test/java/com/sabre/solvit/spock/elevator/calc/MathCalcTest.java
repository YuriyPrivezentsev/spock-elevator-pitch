package com.sabre.solvit.spock.elevator.calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathCalcTest {

    private MathCalc calculator = new MathCalc();

    @Test
    void testSum() {
        Double sum = calculator.sum(2.5, 3.);
        assertEquals(5.5, sum.doubleValue());
    }

    @Test
    void testSumWithNull(){
        Double sum = calculator.sum(null, 3.);
        assertEquals(3., sum.doubleValue());
    }

    @Test
    void testSumNullOnly(){
        Double sum = calculator.sum(null, null);
        assertEquals(0., sum.doubleValue());
    }

    @Test
    void testDivision(){
        Double fraction = calculator.divide(6., 2.);
        assertEquals(3., fraction.doubleValue());
    }

    @Test
    void testDivisionByZeroException(){
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(6., 0.));
    }

    @Test
    void testDivisionByNullException(){
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(6., null));
    }

    @Test
    void testDivisionOfNullException(){
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(null, 3.));
    }

}