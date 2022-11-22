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
        //위에서 주소만 생성했을 뿐 값을 넣은 것이 아니므로 값을 지정해준다.

        for(int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

    }
}
