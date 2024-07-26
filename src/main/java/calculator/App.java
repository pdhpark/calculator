package calculator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Queue<Integer> que1 = new LinkedList<Integer>();
        ArrayList<Double> que2 = new ArrayList<Double>();

        Calculator cal1 = new Calculator(que1);
        Calculator cal2 = new Calculator(que2);
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

                int result = 0;

                result = cal1.calculate(z, x, y);
                System.out.println(result);

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
