package calculator;
import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int x = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int y = sc.nextInt();

        System.out.print("사칙연산 기호를 입력하세요: ");
        char z = sc.next().charAt(0);

        int result = 0;
        switch(z) {
            case '+' :
                result = x + y;
                System.out.println("결과: " + result);
                break;
            case '-' :
                result = x - y;
                System.out.println("결과: " + result);
                break;
            case '*' :
                result = x * y;
                System.out.println("결과: " + result);
                break;
            case '/' :
                if(y != 0) {
                    result = x / y;
                    System.out.println("결과: " + result);
                }
                else System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                break;
        }
    }
}
