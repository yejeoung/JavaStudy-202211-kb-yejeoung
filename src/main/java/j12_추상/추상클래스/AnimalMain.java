package j12_추상.추상클래스;

import java.util.Scanner;

public class AnimalMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Animal animal = null;

        while (true) {
            String select = null;

            System.out.println("1. 사람");
            System.out.println("2. 호랑이");
            System.out.println("q. 종료");
            System.out.println("동물을 선택하세요 >>>");

            select = scanner.nextLine();

            if (select.equals("1")) {
                animal = new Human("사람");

            } else if (select.equals("2")) {
                animal = new Tiger("호랑이");

            } else if (select.equals("q")) {
                break;

            } else {
                System.out.println("다시 입력하세요.");
            }

            if(select.equals("1") || select.equals("2")) {
                animal.move();
                //사람이 나오면 사람이 움직인다를 출력하고 호랑이가 나오면 호랑이가 움직인다를 출력하여라.
            }
            System.out.println();
        }

        System.out.println("프로그램이 종료되었습니다.");

//        Animal animal = new Animal();

//        animal.move();
        //굳이 이것을 입력해서 동작화 시키지 않아도 틀만 잡아놓기 위해 생성

    }
}
