package j15_제네릭;

public class InformationMain {

    public static void main(String[] args) {

        Student student = Student.builder()
                .studentCode(20220001)
                .name("홍길동")
                .build();

        Teacher teacher = Teacher.builder()
                .teacherCode(200)
                .name("홍길동")
                .build();


        //T 안에 student, teacher이 들어가서
        Information<Student> studentInformation
                = new Information<Student>(student);
        //매개변수가 student로 잡힘

        Information<Teacher> teacherInformation
                = new Information<Teacher>(teacher);
        //매개변수가 teacher로 잡힘

        Information2 i1 = new Information2(student);
        Information2 i2 = new Information2(teacher);

        studentInformation.printInfo();
        teacherInformation.printInfo();

        System.out.println("학생 이름: " + studentInformation.getTarget().getName());
        System.out.println("학생 이름2: " + ((Student)i1.getTarget()).getName());
        //Object 타입으로 들어가기 때문에 다운캐스팅을 시켜주어야만 사용이 가능하다.
    }
}
