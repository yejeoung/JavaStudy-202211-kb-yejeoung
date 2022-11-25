package j14_스태틱.싱글톤;

import lombok.Getter;

import java.util.Scanner;

public class ScannerSingleton {
    //2. 자기 자신을 static 변수로 가지고 있어야한다.
    private static ScannerSingleton instance = null;

    @Getter
    private Scanner scanner; //private 을 해놓았기 때문에 다른 곳에서도 사용할 수 있도록 Getter 를 해줌
    //getScanner 생성
    //변수 위에 Getter 를 입력하면 내가 사용하고자하는 것만 Getter 생성이 가능하다.

    //1. 생성자가 private 접근지정자여야한다.
    public ScannerSingleton () {
        scanner = new Scanner(System.in);
    }

    public static ScannerSingleton getInstance() { //ScannerSingleton 객체를 리턴해야한다.
        if (instance == null) {
            instance = new ScannerSingleton();
        }
        return instance; //ScannerSingleton 자료형의 변수
    }
}