package j05_조건;

import java.util.Scanner;

public class Condition4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.print("시험 성적 입력 : ");
        score = scanner.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("잘못된 입력!");
        } else {
            switch (score / 10) {
                case 10:
                case 9:
                    System.out.println("A학점");
                    break;
                case 8:
                    System.out.println("B학점");
                    break;
                case 7:
                    System.out.println("C학점");
                    break;
                case 6:
                    System.out.println("D학점");
                    break;
                default:
                    System.out.println("F학점");
            }
        }
    }
}
