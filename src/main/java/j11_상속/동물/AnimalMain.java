package j11_상속.동물;

public class AnimalMain {

    public static void main(String[] args) {
        Animal animal = new Animal(); //Animal 생성
        Human human = new Human(); //Animal, Human 생성
        Tiger tiger = new Tiger(); //Animal, Tiger 생성
        //상위 객체가 먼저 생성 후 하위 객체가 생성이 된다.
        //메모리 할당을 한다고 하더라도 객체가 합쳐지는 것이 아니라 확장만 된다.

        int a = (int) 3.14; //다운캐스팅
        double d = (double) 3; //업캐스팅 /앞에 double 생략 가능

        Animal hAnimal = human; //묵시적 형 변환 /앞에 객체를 명시 안 해주어도 되기 때문에 업캐스팅
        Animal tAnimal = tiger;
        Animal[] animals = new Animal[3];

        animals[0] = new Human(); //human, hAnimal 다 가능
        animals[1] = new Tiger();
        animals[2] = new Animal();

        //오버라이드를 한 후에 업캐스팅을 하게 되면 재정의된 것들을 사용하게 된다.
        for(int i = 0; i < animals.length; i++) {
            animals[i].move();
        }

        for(int i = 0; i < animals.length; i++) {
            if(animals[i] instanceof Human) { //instanceof : 객체가 어떤 클래스인지, 어떤 클래스를 상속받았는지 확인하는데 사용하는 연산자
                //Human 안에 든 것들과 Tiger 안에 든 것들을 따로 인식하게되어
                //Human에 있던 것들만 출력하게 됨
                Human h = (Human) animals[i]; //다운캐스팅 (명시적 형 변환을 꼭 해주어야 가능)
                h.readBooks(); //다운캐스팅을 했기 때문에 Human 객체 안에 있는 것을 호출 할 수 있다.
                //안에 Tiger 객체도 포함이 되어있기 때문에 오류가 발생하게 된다.
            } else if(animals[i] instanceof Tiger) {
                Tiger t = (Tiger) animals[i];
                t.hunting();
            } else  {
                System.out.println("다운캐스팅 불가");
            }
        }

//        animal.move();
//        human.move();
//        //human 안에 move를 새로 형성하면 새로운 메서드로 생성이 된다.
//        //상속 받은 animal에도 move가 있지만 새로 형성하게 되면 동일한 메서드를 허용해준다.
//        tiger.move();
//
//        //각각의 주소에만 있는 메서드
//        human.readBooks();
//        tiger.hunting();

    }
}
