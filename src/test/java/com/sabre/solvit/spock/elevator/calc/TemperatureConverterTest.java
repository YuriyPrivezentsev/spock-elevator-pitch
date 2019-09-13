package com.sabre.solvit.spock.elevator.calc;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Matchers.anyDouble;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class TemperatureConverterTest {

    @Test
    void testCelsiusToFahrenheitWithMock() {
        //given:
        MathCalc calcMock = mock(MathCalc.class);
        when(calcMock.multiply(9., 9.)).thenReturn(81.);
        when(calcMock.divide(81., 5.)).thenReturn(16.2);

        TemperatureConverter converter = new TemperatureConverter(calcMock);

        //when:
        Double fahrenheit = converter.celsiusToFahrenheit(9.);

        //then:
        assertEquals(48.2, fahrenheit.doubleValue());

        verify(calcMock, Mockito.times(1)).multiply(9., 9.);
        verify(calcMock, Mockito.times(1)).divide(81., 5.);
    }

    @Test
    void testCelsiusToFahrenheitWithSpy() {
        //given:
        MathCalc calc = new MathCalc();
        MathCalc calcSpy = Mockito.spy(calc);
        when(calcSpy.multiply(36., 9.)).thenReturn(324.);

        TemperatureConverter converter = new TemperatureConverter(calcSpy);

        //when:
        Double fahrenheit = converter.celsiusToFahrenheit(36.);

        //then:
        assertThat(fahrenheit, equalTo(96.8));

        verify(calcSpy, Mockito.times(1)).multiply(36., 9.);
        verify(calcSpy, Mockito.times(1)).divide(anyDouble(), anyDouble());
    }
}