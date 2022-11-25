package j14_스태틱.내부클래스;

public class Main {
    public static void main(String[] args) {

        A.B b = new A().new B("홍길동");
        //A클래스 안에 있는 내부 B클래스 생성
        //A클래스를 메모리 할당 시켜주어야 그 안에 있는 B클래스를 생성시킬 수 있다.

        //A 클래스를 생성하지 않고 B클래스를 사용하려면 B클래스가 static이어야한다.
        // 접근이 가능한거지 생성된 것은아니다.
        // 접근하면 생성자가 호출 가능하다.
        // new를 통한 '생성자 호출'이 가능하다.
        //static이 없을 경우 메모리 할당이 되어있어야 호출이 가능하다.

        System.out.println(b.getName());
    }
}
