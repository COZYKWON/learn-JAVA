package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** 입력한 숫자의 합계와 평균 계산 프로그램 ***");
        System.out.println();

        int sum = 0;
        double average = 0;
        int count = 1;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");

        while (true) {
            int num = scanner.nextInt();

            if (num == -1) {
                break;
            }
            sum += num;
            average = (double) sum / count;
            count++;
        }
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + average);
    }
}
