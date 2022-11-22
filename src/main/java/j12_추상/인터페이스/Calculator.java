package j12_추상.인터페이스;

// 추상클래스는 기본적으로 모든 클래스와 동일하지만 그 안에 추상 메소드를 포함할 수 있는 것을 의미
// 인터페이스는 메소드를 정의를 했는데 세미콜론으로 끝나면 추상 메소드(구현x)지만,
// public 다음에 abstract가 들어가지 않는다.

// 일반 변수는 사용할 수 없다. /변수 선언 자체가 되지않는다.

/*
    인터페이스의 특징
    1. 모든 메소드는 기본적으로 추상 메소드이다.
    2. 변수는 선언할 수 없다.
    ex)private(x) int ERROR_CODE = 0;
    3. 상수는 선언할 수 있다. (기본적으로 모든 변수 선언은 상수로 선언된다.)
    ex)int ERROR_CODE = 0; / public int ERROR_CODE = 0;
    4. 일반 메소드를 선언하고 싶으면 abstract 대신에 default 키워드를 사용한다.
 */

//상수 안의 값이 바뀌는지 안 바뀌는지를 확인해서 상수인지 아닌지 확인할 수 있다.
public interface Calculator {

    public int ERROR_CODE = -999999;
    //final 선언 안 해도 됨

    public int calc(int[] values); //추상 메소드를 담기 위한 용도

    public default void setErrorCode() {
        //ERROR_CODE = 10;
        //상수기 때문에 선언을 할 수가 없다.
    }
}
