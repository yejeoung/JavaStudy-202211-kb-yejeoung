package j08_클래스;

public class PhoneMain {

    public static void main(String[] args) {

        //생성자
        Phone iPhone14 = new Phone(); //new : 동적 메모리할당
        Phone galaxyS22 = new Phone("SAMSUNG", "GalaxyS22");
        System.out.println(iPhone14);
        System.out.println(galaxyS22);

        iPhone14.company = "Apple"; //메인변수명.생성변수명 = 값 //. 주소참조

        iPhone14.printPhoneCompany();
        iPhone14.printPhoneModel();

        galaxyS22.printPhoneCompany();
        galaxyS22.printPhoneModel();
    }
}
