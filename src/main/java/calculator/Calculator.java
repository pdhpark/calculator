package calculator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Calculator {

    //static, final을 사용하지 않은 이유는 계산기 기능과 원의 넓이를 구하는 과정에서, 값이 하나이며 반드시 변하지 않는 상수는 원의 넓이를 구하는 식에 쓰는 PI가 있다고 판단했지만
    //Math클래스 기능을 사용하면 굳이 static final을 쓸 필요가 없다고 생각하여 쓰지 않았습니다.

    static Queue<Integer> calculator;
    static ArrayList<Double> calculatorcircle;


    //사칙연산 생성자
    Calculator(Queue<Integer> calculator) {
        this.calculator = calculator;
    }

    //원의넓이 생성자
    Calculator(ArrayList<Double> calculator) {
        this.calculatorcircle = calculator;
    }

    //사칙연산 관련 메서드
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

    //원의넓이 관련 메서드
    public ArrayList<Double> getCalculatorcircle() {
        return calculatorcircle;
    }

    public void setCalculatorcircle() {
    }

    public void inquiryCircleArea() {
        for (double a : this.getCalculatorcircle()) System.out.println(a);
    }

}
