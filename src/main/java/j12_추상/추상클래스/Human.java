package j12_추상.추상클래스;

public class Human extends Animal {

    //생략 되어 있는 생성사
    public Human(String kind) {
        super(kind);
        //상속 되는 곳에 기본 생성자가 입력이 되어있지 않으면, super 안에 값을 입력해주어야한다.
        //상속 되어 있는 상위 클래스를 호출하기 위해서 사용 했으나
        //상위 클래스에 입력이 안 되어 있으면 입력을 해주어야 사용이 가능하다.
    }

    @Override
    public void move() {
        System.out.println("사람이 움직인다.");
    }
}
