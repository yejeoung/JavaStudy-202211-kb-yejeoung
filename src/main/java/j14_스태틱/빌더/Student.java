package j14_스태틱.빌더;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

@Builder
@ToString

@AllArgsConstructor
//모든 매개변수 포함


public class Student {
    private int studentCode;
    private String name;
    private String address;

    public static StudentBuilder builder() { //static메소드
        return new StudentBuilder(); //StudentBuilder 생성
    }

    //클래스 안에 클래스 => 내부클래스
    public static class StudentBuilder {
        //빌더의 특징 1. 외부 클래스와 변수가 동일하게 들어감
        //static을 입력해 생성하지 않아도 사용할 수 있도록 하였다.
        private int studentCode;
        private String name;
        private String address;

        public StudentBuilder studentCode(int studentCode) {
            //메소드명은 변수명과 같아야한다. /매개변수도 변수명과 동일해야한다.
            this.studentCode = studentCode; //return이 없다고 가정하면 Setter이다.
            return this; //자기 자신의 주소값을 리턴
        }

        public StudentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder address(String address) {
            this.address = address;
            return this;
        }

        public Student build() {
            return new Student(studentCode, name, address);
            //Studnet를 만들어서 매개변수 생성한 것을 빌드 안에 리턴
        }
    }
}
