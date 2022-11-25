package j14_스태틱.빌더;

public class StudentMain {

    public static void main(String[] args) {

        Student student = Student.builder() //빌더 클래스 객체 생성
                .studentCode(20220001)
                .name("홍길동")
                .address("부산")
                .build();

        System.out.println(student);

        Student.StudentBuilder sb = new Student.StudentBuilder();
        //바로 접근하여 생성을 한 후 출력이 가능해진다.
    }
}
