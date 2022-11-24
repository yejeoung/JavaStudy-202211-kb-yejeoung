package j13_Object;

import lombok.*;

import java.util.Objects;

/*
    클래스
    Entity 객체 -> 정보를 담는 객체
    Servise 객체 -> 로직(논리적인 흐름)들을 정리해주는 객체
 */

//위에 입력을 해놓으면 자동으로 입력이 된다.
@NoArgsConstructor //매개변수x, 기본 생성자
@AllArgsConstructor //전체 생성자

//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data //Data로 네 개를 한꺼번에 묶어 사용할 수 있다.

public class Entity {

    private String name;
    private int age;
    private Object address;

    public boolean cmp(Object obj) {
        return this.getClass() == Entity.class;
        //주소.클래스 == 클래스.클래스
    }
}
