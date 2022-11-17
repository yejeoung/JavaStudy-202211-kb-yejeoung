package j08_클래스;
/*
    Class : Student, StudentMain
    학생 정보
    String school(학교명)
    String name(학생이름)
    int studentYear(학년)
    boolean gender(성벽 true = 남, false = 여)

    showStudentInfo() {
        학교명 : 부산대학교
        이름 : 홍길동
        학년 : 3
        성별 : 남
 */
public class Student {
    String school;
    String name;
    int studentYear;
    boolean gender;

    Student() {}
    Student(String school, String name, int studentYear, boolean gender) {
        this.school = school;
        this.name = name;
        this.studentYear = studentYear;
        this.gender = gender;
}

    void showStudentInfo() {
        System.out.println("학교명 : " + school);
        System.out.println("이름 : " + name);
        System.out.println("학년 : " + studentYear);
        System.out.println("성별 : " + (gender ? "남" : "여"));
    }
}

