package calculator;

public class ModOperator implements GrossCalculate{
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber % secondNumber;
    }
}
