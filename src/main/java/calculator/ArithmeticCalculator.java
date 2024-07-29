package calculator;

import java.util.Queue;

public class ArithmeticCalculator extends Calculator {
    AddOperator addOperator = new AddOperator();
    SubstractOperator substractOperator = new SubstractOperator();
    MultiplyOperator multiplyOperator = new MultiplyOperator();
    DivideOperator divideOperator = new DivideOperator();

    ArithmeticCalculator(Queue<Integer> calculator) {
        super(calculator);
    }

    public int calculate(char operator, int firstNumber, int secondNumber) {
        int result = 0;
        if (operator != '+' && operator != '-' && operator != '*' && operator != '/')
            throw new FoolException("연산자오류입니다");
        switch (operator) {
            case '+':
                result = addOperator.operate(firstNumber, secondNumber);
                calculator.add(result);
                break;
            case '-':
                result = substractOperator.operate(firstNumber, secondNumber);
                calculator.add(result);
                break;
            case '*':
                result = multiplyOperator.operate(firstNumber, secondNumber);
                calculator.add(result);
                break;
            case '/':
                result = divideOperator.operate(firstNumber , secondNumber);
                calculator.add(result);
                break;
        }
        return result;
    }

}
