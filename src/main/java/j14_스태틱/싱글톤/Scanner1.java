package j14_스태틱.싱글톤;

import java.util.Scanner;

public class Scanner1 {

    public void inputName() {
        String name = null;
        Scanner scanner = ScannerSingleton.getInstance().getScanner();
        //ScaanerSingleton 안에 있는 getInstance 안에 있는 getScanner를 호출
        //SS {scanner} → SS.static { SS {scanner} }

        System.out.print("이름을 입력하세요: ");
        name = scanner.nextLine();

        System.out.println("이름: " + name);
    }
}
