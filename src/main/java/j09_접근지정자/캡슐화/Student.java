package j09_접근지정자.캡슐화;

public class Student {
    public String name;
    public String gender;

    public Student() {
    }

    public Student(String name, String gender) {
        //private으로 묶어놨기 때문에 생성자 안에 값을 지정해줌
        this.name = name;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }
    //새로운 것을 선언한 것이 아닌 위에 선언한 같은 변수명이라는 것을
    //인식시켜주기 위해 this를 넣어준다.

    public String getName() {
        return name;
        //private일 경우 public을 하나 더 만들어서 메인클래스로 가지고 갈 수 있다.
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
    }
}


