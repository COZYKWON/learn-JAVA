package method;

import java.util.Scanner;

public class Method1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 1;
        int b = 2;
        System.out.println(a + " + " + b + " 연산 수행");
        int sum1 = a + b;
        System.out.println("결과1 출력: " + sum1);

        System.out.println("======================");

        int x = 10;
        int y = 20;
        System.out.println(x + " + " + y + " 연산 수행");
        int sum2 = x + y;
        System.out.println("결과2 출력: " + sum2);
    }
}
