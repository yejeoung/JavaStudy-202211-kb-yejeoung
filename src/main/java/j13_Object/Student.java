package j13_Object;

import java.util.Objects;

public class Student {

    private int code;
    private String name;

    public Student(int code, String name) {
        this.code = code;
        this.name = name;
    }

    //Alt + Ins -> equals, hashCode
    @Override
    //오버라이드를 하게 됨으로써 주소끼리의 비교가 아닌 문자열끼리 비교를 하게 해줌
    //오버라이드를 할 때 변수명은 바꾸어도 되지만, 자료형은 바뀌어선 안 된다.
    //equals => 클래스 객체 자체를 비교
    public boolean equals(Object o) { //매개변수 -> Objects /업캐스팅
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        // (o instanceof Student) 와 같은 말
        //getClass는 자기자신 즉, this
        Student student = (Student) o; //다운캐스팅
        return code == student.code && Objects.equals(name, student.name);
        //Objects : 여러가지 메소드들이 들어있음
        //Objects.equals => String.equals와 같은 경우
        //(name, student.name) 만 입력을 해도 문제가 되지 않는다.
    }

    @Override
    public int hashCode() { //hashCode => 입력된 값(정보 값)만을 가지고 비교
        return Objects.hash(code, name); //hash() 안에 넣은 것들을 모두 안에 있는 값들을 가지고 hashCode값을 찾아준다.
    }

    @Override
    public String toString() { //return값으로 재정의 가능
        return "Student{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }
}

