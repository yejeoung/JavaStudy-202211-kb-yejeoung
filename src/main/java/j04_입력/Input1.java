package j04_입력;

import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {
        String name = null;
        int age = 0;
        String phone = null;
        String address = null;

        Scanner scanner = new Scanner(System.in);

        name = scanner.nextLine();
        age = scanner.nextInt();
        scanner.nextLine();
        //나이 뒤에 enter를 생략 해준다.
        //nextLine이 다음에 오면 무조건 한 번 생략하게끔 넣어주어야한다.
        phone = scanner.nextLine();
        address = scanner.nextLine();
        //nextInt의 경우 enter가 자동으로 입력되므로 입력을 받을 때
        //수동으로 enter를 누르게 되면 enter가 두 번 입력 받기 때문에
        //무시하고 넘어가게 된다.
        //next만 칠 경우 자동 enter가 되지 않는다.

        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("연락처 : " + phone);
        System.out.println("주소 : " + address);
    }
}
