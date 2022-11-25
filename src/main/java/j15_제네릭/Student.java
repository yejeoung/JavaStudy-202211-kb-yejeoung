package j15_제네릭;

import lombok.Builder;
import lombok.Data;

@Builder
@Data

public class Student {//학생 정보를 담는 객체

    private int studentCode;
    private String name;
}
