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

        System.out.println(z);
    }
}
