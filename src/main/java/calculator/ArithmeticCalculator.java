package calculator;

import java.util.Queue;

public class ArithmeticCalculator extends Calculator {
    ArithmeticCalculator(Queue<Integer> calculator) {
        super(calculator);
    }

    public int calculate(char operator, int firstNumber, int secondNumber) {
        int result = 0;
        if (operator != '+' && operator != '-' && operator != '*' && operator != '/')
            throw new FoolException("연산자오류입니다");
        switch (operator) {
            case '+':
                calculator.add(firstNumber + secondNumber);
                result = firstNumber + secondNumber;
                break;
            case '-':
                calculator.add(firstNumber - secondNumber);
                result = firstNumber - secondNumber;
                break;
            case '*':
                calculator.add(firstNumber * secondNumber);
                result = firstNumber * secondNumber;
                break;
            case '/':
                if (secondNumber == 0) throw new FoolException("0으로 나눈 오류입니다.");
                calculator.add(firstNumber / secondNumber);
                result = firstNumber / secondNumber;
                break;
        }
        return result;
    }

}
