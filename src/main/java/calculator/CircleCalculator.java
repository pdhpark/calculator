package calculator;

import java.util.ArrayList;

public class CircleCalculator extends Calculator{

    CircleCalculator(ArrayList<Double> calculator) {
        super(calculator);
    }

    public Double calculateCircleArea(Double radius) {
        calculatorcircle.add(radius * radius * Math.PI);
        return radius * radius * Math.PI;
    }
}