package calculator;

public class AddOperator implements GrossCalculate {
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
