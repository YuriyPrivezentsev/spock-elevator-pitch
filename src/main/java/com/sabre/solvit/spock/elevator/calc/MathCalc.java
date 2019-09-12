package com.sabre.solvit.spock.elevator.calc;

import java.util.Arrays;
import java.util.Objects;

class MathCalc {
    Double sum(Double ... operands){
        if(operands == null){
            throw new IllegalArgumentException("Sum cannot be called on null elements");
        }
        return Arrays.stream(operands).filter(Objects::nonNull).mapToDouble(item -> item).sum();
    }

    Double multiply(Double ... operands){
        if(operands == null){
            throw new IllegalArgumentException("Sum cannot be called on null elements");
        }
        return Arrays.stream(operands)
                .map(operand -> operand == null ? 0. : operand)
                .reduce(1.,(accumulator,multiplier) -> accumulator*multiplier);
    }

    Double divide(Double numerator, Double denominator){
        if(numerator == null || denominator == null || denominator == 0){
            throw new IllegalArgumentException("Invalid fraction values");
        }
        return numerator/denominator;
    }

}
