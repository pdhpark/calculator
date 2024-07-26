package calculator;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {

    private Queue<Integer> calculator;

    Calculator(Queue<Integer> calculator)
    {
        this.calculator = calculator;
    }

    public Queue<Integer> getCalculator() {
        return calculator;
    }

    public void setCalculator() {
        calculator.poll();
    }

    public void removeResult() {
        calculator.poll();
    }

    public void inquiryResults() {
        for (int a : this.getCalculator()) System.out.println(a);
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
