package calculator;
import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int[] results = new int[10];
        while(true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int x = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int y = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char z = sc.next().charAt(0);

            int result = 0;

            switch (z) {
                case '+':
                    result = x + y;
                    System.out.println("결과: " + result);
                    if(cnt >= 10)
                    {
                        for(int i=0; i<9; i++) results[i] = results[i+1];
                        results[9] = result;
                    }
                    else results[cnt] = result;
                    cnt++;
                    break;
                case '-':
                    result = x - y;
                    System.out.println("결과: " + result);
                    if(cnt >= 10)
                    {
                        for(int i=0; i<9; i++) results[i] = results[i+1];
                        results[9] = result;
                    }
                    else results[cnt] = result;
                    cnt++;
                    break;
                case '*':
                    result = x * y;
                    System.out.println("결과: " + result);
                    if(cnt >= 10)
                    {
                        for(int i=0; i<9; i++) results[i] = results[i+1];
                        results[9] = result;
                    }
                    else results[cnt] = result;
                    cnt++;
                    break;
                case '/':
                    if (y != 0) {
                        result = x / y;
                        System.out.println("결과: " + result);
                        if(cnt >= 10)
                        {
                            for(int i=0; i<9; i++) results[i] = results[i+1];
                            results[9] = result;
                        }
                        else results[cnt] = result;
                        cnt++;
                    } else System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    break;
            }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String doorstop = sc.next();
            if(doorstop.equals("exit")) break;
        }
    }
}
