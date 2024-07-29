package calculator;

public class DivideOperator implements GrossCalculate {
    @Override
    public int operate(int firstNumber, int secondNumber) {
        if (secondNumber == 0) throw new FoolException("0으로 나눈 오류입니다.");
        return firstNumber / secondNumber;
    }
}