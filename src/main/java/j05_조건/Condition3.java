package j05_조건;

import java.util.Scanner;

public class Condition3 {
    public static void main(String[] args) {

        String select = null;

        Scanner scanner = new Scanner(System.in);
        System.out.print("선택 : ");
        select = scanner.nextLine();

        switch (select) {
            case "아침":
                System.out.println("아침 식사");
                break; //case 다음에 break를 써주지 않으면 모든 case가 출력
            case "점심":
                System.out.println("점심 식사");
                break;
            case "저녁":
                System.out.println("저녁 식사");
                break;
            default: //case에 입력한 값 외 다른 값
                System.out.println("잘못된 입력입니다.");
        }
    }
}
