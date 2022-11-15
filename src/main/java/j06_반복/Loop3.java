package j06_반복;

public class Loop3 {
    public static void main(String[] args) {
        /*
        1.
            *
            **
            ***
            ****
            *****

         2.
            *****
            ****
            ***
            **
            *

         3.
                *
               **
              ***
             ****
            *****

         4.
            *****
             ****
              ***
               **
                *
         */

        int n = 5;

        for (int i = 0; i < n; i++) { //행
            for (int j = 0; j < i + 1; j++) { //출력
                System.out.print("*");
            }
            System.out.println(); //공백
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //짝수 구하는 공식 : x * 2 -> 홀수 : x * 2 - 1

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - 1) - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < ((i + 1) * 2 - 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //거꾸로 세모와 위에것을 연결시키기 위해 네 줄만 입력을 하기 위해서 i + 1이 아닌 i + 2를 입력 -> ((i + 2) * 2 - 1)
        //위가 크고 갈수록 작아지기 때문에 임의로 9보다 하나 더 큰 10을 빼준다.
        //10 - ((i + 2) 2 * 1)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 10 - ((i + 2) * 2 - 1); j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
