package j15_제네릭;

public class ResponseMain {

    //<?> => 이 곳에 어떤 자료형이 들어갈지 모른다는 의미
    //리턴 할 때 마다 자료형이 바뀔 수 있기 때문에 쓰임
    public static CMRespDto<?> response(String msg, Object data) {
        return new CMRespDto<>(msg, data);
        //오브젝트 타입을 넣었을 경우 알아서 오브젝트라는 타입을 잡아주기 때문에 어떠한 자료형을 넣어도 실행이 된다.
        //별도 다운캐스팅이 필요가 없다.
    }

    public static void main(String[] args) {
        Student student = Student.builder()
                .studentCode(20220001)
                .name("홍길동")
                .build();

        System.out.println(response("학생데이터 응답", student));
        System.out.println(response("student code error!!", "학번에 오류가 있습니다."));
    }
}
