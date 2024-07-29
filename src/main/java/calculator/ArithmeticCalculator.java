package calculator;

import java.util.Queue;

public class ArithmeticCalculator extends Calculator {

    ArithmeticCalculator(Queue<Integer> calculator) {
        super(calculator);
    }

    public int calculate(GrossCalculate grossCalculate, int firstNumber, int secondNumber) {
        return grossCalculate.operate(firstNumber, secondNumber);
    }

}
