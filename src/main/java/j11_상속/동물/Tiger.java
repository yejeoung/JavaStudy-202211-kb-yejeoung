package j11_상속.동물;

public class Tiger extends Animal {

    public Tiger() {
        super(); //생성자 호출
        System.out.println("Tiger 객체 생성");
    }

    @Override //Ctrl + O -> 자동 오버라이드
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }

    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}
