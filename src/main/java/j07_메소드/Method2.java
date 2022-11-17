package j07_메소드;

public class Method2 {
    /*
        메소드 오버로딩
     */

    public static void print(String name) {
        System.out.println("이름 : " + name);
    }

    public static void print(int age) { //같은 자료형을 사용할 때 같은 메소드명을 사용할 수 없다. (반대로도 불가능)
        System.out.println("나이 : " + age);
    }

    public static void print(String name, int age) { //매개변수(parameter) 위치를 바꾸어서 사용가능
        System.out.println("이름 : " + name + "나이 : " + age);
    }

    public static void print(int age, String name) {
        System.out.println("이름 : " + name + " 나이 : " + age);
    }

    public static void main(String[] args) {
        print("홍길동");
        print(24);
        print("홍길동", 24);
        print(24, "홍길동");
    }
}
