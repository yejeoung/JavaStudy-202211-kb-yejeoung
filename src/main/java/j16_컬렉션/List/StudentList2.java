package j16_컬렉션.List;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentList2 {

    public static void main(String[] args) {
//        new Hobby(1, "축구");
//        new Hobby(2, "농구");
//        new Hobby(3, "골프");
//        new Hobby(4, "음악감상");

//        String[] names = new String[] {"김준일", "김준이", "김준삼"};

//        List<String> nameList;
//
//        nameList = Arrays.asList(names);
//        //객체 생성만한 asList를 List로 반환시켜준다.

        //배열을 List로 변환
//        List<String> nameList = Arrays.asList(new String[] {
//                "김준일",
//                "김준이",
//                "김준삼"
//        });
//
//        for(Hobby h : hobbyList){
//            System.out.println(h);
//        }
//
//        Object[] nameArray = nameList.toArray();
//
//        System.out.println((String)nameArray[0]);
//        //객체일 경우 메소드를 사용할 때 다운캐스팅을 꼭 해주어야 사용이 가능하다.
//        //String일 경우 Object안에 포함이 되어있는 것이라 생략이 가능하다.
//        //배열을 다운캐스팅 시키는 것이 아니라
//        //그 안에 있는 값을 다운캐스팅을 해주어야 가능하다.


        List<Hobby> hl = Arrays.asList(new Hobby[]{
                new Hobby(1, "축구"),
                new Hobby(2, "농구"),
                new Hobby(3, "골프"),
                new Hobby(4, "음악감상")
                //AllArgsConstructor가 들어있어서 자료형이 다른 매개변수 두 개가 들어갈 수 있다.
                //Builder를 선언하면서 안에 포함이 되어있는 것이다.
        });

        Student2 s1 = Student2.builder()
                .studentId(20220001)
                .name("고동현")
                .age(21)
                .hobbyList(Arrays.asList(new Hobby[]{hl.get(0), hl.get(2)}))
                .build();

        Student2 s2 = Student2.builder()
                .studentId(20220001)
                .name("강동욱")
                .age(22)
                .hobbyList(Arrays.asList(new Hobby[]{hl.get(1), hl.get(3)}))
                .build();

        Student2 s3 = Student2.builder()
                .studentId(20220001)
                .name("정진호")
                .age(23)
                .hobbyList(Arrays.asList(new Hobby[]{hl.get(0), hl.get(3)}))
                .build();

        System.out.println(s1);

        List<Student2> sl = new ArrayList<Student2>();
        sl.add(s1);
        sl.add(s2);
        sl.add(s3);

        for(Student2 s : sl) {
            System.out.println("<학생정보>");
            System.out.println(s);
            System.out.println("<" + s.getName() + " 학생 취미>");

            for(Hobby h : s.getHobbyList()) {
                System.out.println(h);
            }
            System.out.println();
        }

    }
}
