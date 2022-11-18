package j09_접근지정자.캡슐화;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student("홍길동", "남");
        s1.printInfo();

        s1.setName("홍기동");
        s1.printInfo();
        //s1에 이미 값이 입력 되어 있기 때문에 "남"은 자동으로 출력

        s1.gender = "여";
        s1.printInfo();
        System.out.println(s1.gender);
        System.out.println(s1.name);
        //gender와 name을 가지고 오기 위해서는 Student에서 public으로 변경해준다.

    }
}