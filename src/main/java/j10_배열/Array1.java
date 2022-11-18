package j10_배열;

public class Array1 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        //자료형[index] 변수명 = new 자료형[배열 수];
        //int[] -> 정수형 배열

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        //주소만 생성한 것이지 값을 넣은게 아니므로 값을 넣어주어야한다.

        for(int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }

        //배열은 변수명을 하나하나 넣지 않아도 묶여있기 때문에 전체적으로 다 출력이 된다.

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
    }
}
