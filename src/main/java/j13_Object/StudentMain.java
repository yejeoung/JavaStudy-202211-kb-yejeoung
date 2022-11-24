package j13_Object;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StudentMain {

    public static void print(Object obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {
        Student student = new Student(20220001, "홍길동");
        Student student2 = new Student(20220001, "홍길동");

        System.out.println(student.toString());
        System.out.println(student);
        //원래는 toString을 해야하지만 하지 않아도 자동으로 호출이 되기 때문에 생략을 해도 되었던 것이다.
        System.out.println(student2);

        System.out.println(student == student2); //주소값 비교
        System.out.println(student.equals(student2)); //값 비교
//        public boolean equals(Object obj) {
//            return (this == obj);
//        }
        //이 식이 equals안에 적혀있는 것과 같음
        //여기에서 this는 나 자신 즉, Student이다.

        System.out.println();

        //상속은 기본적으로 되어있음
        //Student가 Object를 상속 받고 있기 때문에 메인 밖에 있는 곳에서 업캐스팅 시켜서 출력 가능
        //그러므로 print안에 obj가 아닌 student를 입력해도 가능하다.
        print(student);

        //실제 주소 출력
        System.out.println(student.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student.hashCode() == student2.hashCode());

        System.out.println();

        Class c = student.getClass();
        System.out.println(c); //패키지, 클래스, 클래스명
        System.out.println(c.getName()); //클래스, 클래스명
        System.out.println(c.getSimpleName()); //클래스명

        System.out.println();

        Field[] fields = c.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i].getName());
        }

        Method[] method = c.getDeclaredMethods();
        for (int i = 0; i < method.length; i++) {
            System.out.println(method[i].getName());
        }
    }
}
