package j14_스태틱.빌더;

public class UserMain {

    public static void main(String[] args) {
        User user = User.builder()
                .username("name")
                .password("1234")
                .email("abc123@kakao.com")
                .name("홍길동")
                .build(); //user 객체를 생성해서 리턴
        //순서 상관x
        //주소값 수 상관x

        System.out.println(user);

    }
}
