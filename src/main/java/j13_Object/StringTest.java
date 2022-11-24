package j13_Object;

//import java.util.Scanner;

//모든 클래스는 Object 클래스를 상속 받는다.

public class StringTest {

    public static void main(String[] args) {
        String str= "A";
        String str2 = "A";
        //str = str2 주소가 같다.
        String str3 = new String("A");
        //메모리 할당 후에 str3에 들어간 것이기 때문에 주소 값 자체가 달라진다.

        System.out.println(str == str2);

        System.out.println(str.equals(str2));

        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str == str3);

        System.out.println(str.toString());
        //toString : Object 클래스 안에 들어있는 메소드



//        Scanner scanner = new Scanner(System.in);
//
//        String s = "홍길동";
//        // long 패키지 안에 다 묶여서 들어져있기 때문에 굳이 import 하지 않아도 사용 가능
//
//        Integer integer = 100; //int = integer 동일
//        System.out.println(integer);

    }
}
