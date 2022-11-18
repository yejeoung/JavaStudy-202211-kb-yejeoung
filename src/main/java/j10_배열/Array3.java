package j10_배열;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

/*
            randomArray 배열을 생성(10개)
            10, 2, 4, 5, 3, 7, 1 (범위 1 ~ 10)
            총합 : ??
            배열에서 값을 하나씩 꺼내어 total에 더한다.
            배열의 값을 하나씩 꺼내어 출력한다. (단, 마지막에는 쉼표를 찍지 않는다.)
         */
public class Array3 {
    //최소값 구하는 방법
    public static int foundMinNumber(int[] numbers) {
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static int foundMaxNumber(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i > numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        Random random = new Random();
        random.nextInt();

        int[] randomArray = new int[10];
        int total = 0;

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(10) + 1;
        }

        for (int i = 0; i < randomArray.length; i++) {
            total += randomArray[i];

            System.out.print(randomArray[i]);

            if (i != randomArray.length - 1) {
                System.out.print(", "); // 끝에 쉼표가 붙지 않기 위해 선언
            }
        }
        System.out.println();

        System.out.println("총합: " + total);

        System.out.println("최소값: " + foundMinNumber(randomArray));

        System.out.println("최대값: " + foundMaxNumber(randomArray));


        //랜덤으로 나오는 값이 반복되지 않게 반복문 사용

        for (int i = 0; i < randomArray.length; i++) {
            while (true) {
                int randomNumber = random.nextInt(10) + 1;
                boolean found = true;
                for (int j = 0; j < randomArray.length; j++) {
                    if (randomArray[j] == randomNumber) {
                        found = false;
                        break;
                        //else가 있을 경우(조건을 찾는 경우가 많을 경우) break가 필요하지만
                        // 지금의 경우에는 조건을 비교할 것이 하나 밖에 없으므로 break가 생략 가능
                    }
                }
                if (found) { //found가 true일때 break
                    randomArray[i] = randomNumber;
                    break;
                }


//        int[] randomArray = new int[10];
//        int total = 0;
//
//        for (int i = 0; i < 10; i++) {
//            randomArray[i] = random.nextInt(10);
//            System.out.print(randomArray[i]);
//            if (i < 9) {
//                System.out.print(", "); //끝에 ,(쉼표)가 붙지 않기 위해 선언
//            }
//        }
//        for (int i = 0; i < 10; i++) {
//            total += randomArray[i];
//        }
//        System.out.println();
//        System.out.println("총합: " + total);
            }
        }
    }
}


