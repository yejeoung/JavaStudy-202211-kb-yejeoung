package j12_추상.추상클래스;

/*
    추상 메소드를 하나라도 포함하는 클래스는
    추상 클래스로 정의하여야 한다.
 */
public abstract class Animal {

    private String kind;

    public Animal() {

    }

    public Animal(String kind) { //이 매개변수를 실행시키기 위해서는 기본 생성자가 필요하다.
        System.out.println(kind + "이(가) 생성되었습니다.");
    }

    //추상 메소드
    public abstract void move();
    //클래스 자체를 추상 클래스로 바꾸게 되면 추상 메소드를 꼭 입력할 필요는 없다.
    //전체를 추상으로 인식하기 때문

    public void eat() {
        System.out.println("동물이 밥을 먹습니다.");
    }
    //추상 메소드를 사용하더라도 일반 클래스처럼 입력이 가능하다.
    //추상 메소드를 사용할 경우
    // 부모 클래스에서 추상 메소드 되어 있는 클래스의 객체 생성이 불가능하다.
    // 다른 클래스에 상속이 불가능하다. /기본 생성자를 입력해주어야함
}
