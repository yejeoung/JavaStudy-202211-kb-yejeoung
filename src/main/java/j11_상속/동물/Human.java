package j11_상속.동물;

public class Human extends Animal{

    public Human() {
        super(); //자식 클래스가 부모 클래스로부터 상속받은 멤버를 참조할 때 사용하는 참조 변수 / 생성자 호출
        //this : 자기 주소 호출
        System.out.println("Human 객체 생성");
    }

    @Override //재정의
    //@ 붙은 문법 -> 어노테이션(Annotation)
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void readBooks() {
        System.out.println("사람이 책을 읽습니다.");
    }

}
