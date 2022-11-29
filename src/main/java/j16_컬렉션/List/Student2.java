package j16_컬렉션.List;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data

public class Student2 {

    private int studentId;
    private String name;
    private int age;

    private List<Hobby> hobbyList;
}
