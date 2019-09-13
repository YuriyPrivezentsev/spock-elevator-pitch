package com.sabre.solvit.spock.elevator.calc;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class TemperatureConverter {
    private final MathCalc calculator;

    Double celsiusToFahrenheit(Double celsius){
        return  calculator.divide(
                        calculator.multiply(celsius, 9.), 5.) + 32;
    }

}
