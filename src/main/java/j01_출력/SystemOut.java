package j01_출력;
// class 파일은 대문자로 시작해야한다.
// ; (세미콜론) : 한 줄의 실행명령을 끝마칠 때
/*
 이스케이프 문자
 \n -> 줄바꿈
 \t -> Tap
 \\ : 역슬래시 입력
 */
// 문자열을 입력할때 "(큰따옴표)를 입력해야 출력이 가능
// System.out.println(); -> 줄바꿈이 항상 된다.
public class SystemOut {
    public static void main(String[] args) {
        System.out.print("이름 : ");
        System.out.println("홍길동");
        System.out.print("주소 : ");
        System.out.println("부산 진구 부전동");
        System.out.print("연락처 : ");
        System.out.println("010-1234-5678");
        System.out.print("성별 : ");
        System.out.println("여성");
    }
}
