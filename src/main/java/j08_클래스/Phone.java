package j08_클래스;

public class Phone {

    String company;
    String model;

    Phone(){

    }
    Phone(String c, String m) { //생성자 : 반환 자료형x, 대문자로 시작 /return과 자료형이 생략되어있다.
        //생성자도 메소드이기 때문에 매개변수를 넣어줄 수 있다.
        System.out.println("생성자 호출?");
        System.out.println();
        //생성자 오버로딩
        company = c;
        model = m;
    }

    void printPhoneCompany() {
        System.out.println("제조사 : " + company);
        System.out.println();
    }

    void printPhoneModel() {
        System.out.println("모델명 : " + model);
        System.out.println();
    }
}
