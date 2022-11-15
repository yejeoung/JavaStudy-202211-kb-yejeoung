package j01_출력;
// 변수
public class UserInfo {
    public static void main(String[] args) {
        String name = "홍길동";
        String address = "부산 진구 부전동";
        String phone = "010-1234-5678"; //0과 - 때문에 String을 입력
        int age = 24; // int에 숫자를 입력할 때 0을 처음에 작성하면 표기가 안 됨.
        //마이너스도 정수 마이너스라면 입력 가능

        System.out.println(name + "의 주소는 " + address + "입니다.");
        System.out.println(name + "의 연락처는 " + phone + "입니다.");
        System.out.println(name + "의 나이는 " + age + "살입니다.");
    }
}
