package j11_상속;

public class B extends A {

    /*
        상속이란
        하나의 클래스에 다른 클래스를 확장하는 개념
        상위 클래스의 접근지정자가 private인 것들은 하위 클래스에 접근 할 수 없다.
     */

    private String b;

    public B() {
        b = a; //A클래스가 private이 되어있으면 get을 사용해서 가지고 와야한다.
    }
}
