package calculator;

public class SubstractOperator implements GrossCalculate {
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
}
