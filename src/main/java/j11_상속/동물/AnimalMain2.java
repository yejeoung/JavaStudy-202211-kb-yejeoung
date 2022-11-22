package j11_상속.동물;

public class AnimalMain2 {
    public static void main(String[] args) {

        Animal[] animals = new Animal[5];
        animals[0] = new Human();
        animals[1] = new Tiger();
        animals[2] = new Human();
        animals[3] = new Tiger();
        animals[4] = new Human();

        System.out.println("[업캐스팅]");
        for (int i = 0; i < animals.length; i++) {
            animals[i].move();
        }

        // 오버라이드 Animal이 가지고 있는 move메소드 Tiger가 오버라이드하여 move 재정의 t.move();
        // 오버라이딩이 안 되어있다면 Animal의 move를 참조하였을 것이다.(우선순위)
        // 상속으로 move를 시켜놓았기 때문에 우선순위인 것이다.
        // 오버라이드를 안 하면 그냥 Animal의 move를 사용된다.

        // move는 animal참조
        // move2()를 super.move(); 하면
        // t.move를 실행하면 move2();실행 >> move2();에서 >> 'Animal의 move' 실행

        System.out.println();

        System.out.println("[다운캐스팅]");
        for (int i = 0; i < animals.length; i++) {
            if(animals[i] instanceof Human) {
                ((Human) animals[i]).readBooks(); //괄호안에 다운캐스팅을 먼저 해준 다음에 readBooks()를 해주어야한다.
            } else if (animals[i] instanceof Tiger) {
                ((Tiger) animals[i]).hunting();
            }
        }
    }
}
