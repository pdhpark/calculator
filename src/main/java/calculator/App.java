package calculator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App {

    enum OperatorType {
        ADD, SUBSTRACT, MULTIPLY, DIVIDE, MOD;
    }

    public static void main(String[] args) {

        Queue<Integer> que = new LinkedList<Integer>();
        ArrayList<Double> array = new ArrayList<Double>();

        AddOperator addOperator = new AddOperator();
        SubstractOperator substractOperator = new SubstractOperator();
        MultiplyOperator multiplyOperator = new MultiplyOperator();
        DivideOperator divideOperator = new DivideOperator();
        ModOperator modOperator = new ModOperator();

        ArithmeticCalculator cal1 = new ArithmeticCalculator(que);
        CircleCalculator cal2 = new CircleCalculator(array);
        double radius = 0;

        Scanner sc = new Scanner(System.in);
        while (true) {
            int witchthing = 0;

            System.out.println("원의 넓이 구하기 : 1을 입력, 계산기 기능 이용하기 : 2를 입력");
            witchthing = sc.nextInt();

            if (witchthing == 1) {
                System.out.println("반지름 길이를 입력하세요.");
                radius = sc.nextInt();
                cal2.calculateCircleArea(radius);

                cal2.inquiryCircleArea();

                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                String doorstop = sc.next();
                if (doorstop.equals("exit")) break;

            } else if (witchthing == 2) {

                System.out.print("첫 번째 숫자를 입력하세요: ");
                int x = sc.nextInt();
                System.out.print("두 번째 숫자를 입력하세요: ");
                int y = sc.nextInt();

                System.out.print("사칙연산 기호를 입력하세요: ");
                char z = sc.next().charAt(0);
                String operator = "";

                switch (z) {
                    case '+' :
                        operator = String.valueOf(OperatorType.ADD);
                        break;
                    case '-' :
                        operator = String.valueOf(OperatorType.SUBSTRACT);
                        break;
                    case '*' :
                        operator = String.valueOf(OperatorType.MULTIPLY);
                        break;
                    case '/' :
                        operator = String.valueOf(OperatorType.DIVIDE);
                        break;
                    case '%' :
                        operator = String.valueOf(OperatorType.MOD);
                        break;
                }

                OperatorType optype = OperatorType.valueOf(operator);

//                if (z != '+' && z != '-' && z != '*' && z != '/') throw new FoolException("연산자오류입니다");

                int result = 0;

                switch (z) {
                    case '+':
                        result = cal1.calculate(addOperator, x, y);
                        Calculator.calculator.add(result);
                        System.out.println(result);
                        break;
                    case '-':
                        result = cal1.calculate(substractOperator, x, y);
                        Calculator.calculator.add(result);
                        System.out.println(result);
                        break;
                    case '*':
                        result = cal1.calculate(multiplyOperator, x, y);
                        Calculator.calculator.add(result);
                        System.out.println(result);
                        break;
                    case '/':
                        result = cal1.calculate(divideOperator, x, y);
                        Calculator.calculator.add(result);
                        System.out.println(result);
                        break;
                    case '%':
                        result = cal1.calculate(modOperator, x, y);
                        Calculator.calculator.add(result);
                        System.out.println(result);
                }

                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                String removeornot = sc.next();
                if (removeornot.equals("remove")) cal1.removeResult();

                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String inquiryornot = sc.next();
                if (inquiryornot.equals("inquiry")) cal1.inquiryResults();

                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                String doorstop = sc.next();
                if (doorstop.equals("exit")) break;
            }
        }
    }
}
