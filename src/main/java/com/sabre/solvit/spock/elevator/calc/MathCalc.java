package com.sabre.solvit.spock.elevator.calc;

import java.util.Arrays;

class MathCalc {
    Double sum(Double ... operands){
        return Arrays.stream(operands).mapToDouble(item -> item).sum();
    }
}
