package j12_추상.인터페이스;

/*
    연말정산
 */

public class Tax implements Calculator{ //인터페이스의 상속은 extends가 아닌 implements를 사용한다.
    //추상 메소드를 포함한 클래스는 추상 클래스로 바꾸어주어야한다.
    /*
        추상 메소드를 사용할 수 있는 방법
        1. public과 class 사이에 abstract를 입력해준다.
        2. 추상 메소드를 사용 할 수 있도록 오버라이딩을 해준다.
     */
    //생성자 선언이 불가능하다. 애초에 필요가 없기 때문이기도 하고 일반 변수가 존재하지 않기 때문

    @Override
    public int calc(int[] values) {
        System.out.println("연말정산을 진행합니다.");
        int result = 0;

        for (int i = 0; i < values.length; i++) {
            result += values[i];
        }
        return result;
    }
}
