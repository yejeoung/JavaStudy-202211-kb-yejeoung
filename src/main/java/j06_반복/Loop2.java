package j06_반복;
//2단 ~ 9단 출력
public class Loop2 {
    public static void main(String[] args) {
        /*
            [2단]
            2 x 1 = 2
            2 x 2 = 4
            2 x 3 = 6
            ...
            2 x 9 = 18
         */

//        for(int i = 0; i < 8; i++) {
//            System.out.println("[" + (i + 2) + "단]");
//            for(int j = 0; j < 9; j++) {
//                int num =  i + 2;
//                int num2 = j + 1;
//                System.out.println(num + " x " + num2 + " = " + (num * num2));
//            }
//        }
        for(int i = 0; i < 8; i++) {
            int dan = i + 2;
            System.out.println("[" + dan + "단]");
            for(int j = 0; j < 9; j++) {
                int num2 = j + 1;
                System.out.println(dan + " x " + num2 + " = " + (dan * num2));
            }
        }
    }
}
