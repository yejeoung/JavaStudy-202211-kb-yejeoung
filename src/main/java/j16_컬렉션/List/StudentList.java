package j16_컬렉션.List;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();

        students.add(new Student(20220001, "이승아", 21));
        students.add(new Student(20220001, "김수현", 22));
        students.add(new Student(20220001, "문경원", 23));
        students.add(new Student(20220001, "홍지혜", 24));
        students.add(new Student(20220001, "고동현", 25));

        Student student2 = students.get(0);
        //get 안에 숫자가 바뀔 때마다 순서대로 뽑아서 출력이 됨

        System.out.println(student2);

        System.out.println();

        //이름이 문경원인 학생의 나이를 26세로 바꾸세요.

        //일반 반복문 사용
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getName().equals("문경원")) {
                s.setAge(26);
                break;
            }
        }
        //foreach 사용
        for (Student s : students) { //뒤에 있는 students를 Student s에 대입
            if (s.getName().equals("문경원")) {
                s.setAge(26);
                break;
            }
        }
        System.out.println(students);

        System.out.println();

        //0번 인덱스 학생의 이름을 다음 인덱스의 학생 이름으로 변경
        //제일 마지막 인덱스의 학생 이름으로 0번 인덱스로 이동

        String lastName = null;
        //넘어갈때 다음 인덱스의 학생 이름의 주소가 사라지게 되므로 그 인덱스를 넣기 위한 변수

        for(int i = 0; i < students.size(); i++) {
            int nowIndex = students.size() - 1 - i;
            //뒤에서부터 앞으로 하나씩 옮길 것이기때문에 -1 - i을 함으로써 내림차순
            int preIndex = nowIndex - 1;

            Student s = students.get(nowIndex);

            if(nowIndex == 0) { //0번째 있는 인덱스에 마지막에 남은 인덱스를 넣어라.
                s.setName(lastName);
                break;
            }

            if(nowIndex == students.size() - 1) { //현재 인덱스가 마지막 남은 인덱스일때 실행
                //-1을 안 하면 아무것도 없는 빈 주소이다.
                lastName = s.getName();
            }
            s.setName(students.get(preIndex).getName());
            //현재 이름 주소에 나의 앞에 있는 이름을 가지고 와서 현재 내 자리에 넣어라.
        }

        System.out.println(students);
    }
}

