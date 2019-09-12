package com.sabre.solvit.spock.elevator.calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
    void testSumNullArray(){
        //noinspection ConfusingArgumentToVarargsMethod
        assertThrows(IllegalArgumentException.class, () -> calculator.sum(null));
    }

    @Test
    void testMultiply() {
        Double multiply = calculator.multiply(2.5, 3.,10.);
        assertEquals(75., multiply.doubleValue());
    }

    @Test
    void testMultiplyWithNull(){
        Double multiply = calculator.multiply(null, 3.);
        assertEquals(0., multiply.doubleValue());
    }

    @Test
    void testMultiplyNullArray(){
        //noinspection ConfusingArgumentToVarargsMethod
        assertThrows(IllegalArgumentException.class, () -> calculator.sum(null));
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

    @Test
    void testSubtraction(){
        Double difference = calculator.subtract(6., 2.);
        assertEquals(4., difference.doubleValue());
    }

    @Test
    void testInvalidSubtractionArgumentsException(){
        assertThrows(IllegalArgumentException.class, () -> calculator.subtract(6., null));
    }
}