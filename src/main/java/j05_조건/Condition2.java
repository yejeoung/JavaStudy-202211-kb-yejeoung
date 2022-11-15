package j05_조건;

import java.util.Scanner;

public class Condition2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = 0;

        System.out.print("점수를 입력하세요 : ");
        //println을 사용할 경우 자동 줄바꿈이 되고 난 후에 입력을 받는다.
        score = scanner.nextInt();
//        이상, 이하를 쓰게 될 경우 복잡해지게 되므로 되도록이면 초과, 미만을 사용한다.
//        if(score >= 90 && score <= 100) {
//            System.out.println("A학점");
//        } else if(score >= 80 && score <= 89) {
//            System.out.println("B학점");
//        } else if(score >= 70 && score <= 79) {
//            System.out.println("C학점");
//        } else if(score >= 60 && score <= 69) {
//            System.out.println("D학점");
//        } else if(score >= 0 && score <= 59) {
//            System.out.println("F학점");
//        } else {
//            System.out.println("잘못된 점수입니다.");
//        }

        if(score < 0 || score > 100) {
            System.out.println("잘못된 점수입니다.");
        } else if(score > 89) {
            System.out.println("A학점");
        } else if(score > 79) {
            System.out.println("B학점");
        } else if(score > 69) {
            System.out.println("C학점");
        } else if(score > 59) {
            System.out.println("D학점");
        } else { //else if가 들어가게 될 경우 마지막은 무조건 else만 들어간다.
            System.out.println("F학점");
        }

        // 코드가 길 경우 중괄호{}를 입력해주어야 명확하게 보기 쉽다.

        /*
        점수가 0보다 작거나(OR) 100보다 크면 잘못된 점수입니다. 출력
        90 ~ 100 A학점 출력
        80 ~ 89 B학점 출력
        70 ~ 79 C학점 출력
        60 ~ 69 D학점 출력
        0 ~ 59 F학점 출력
         */
    }
}
