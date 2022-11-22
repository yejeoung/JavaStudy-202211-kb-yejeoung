package j10_배열;

public class Array6 {
    public static void main(String[] args) {

        int[] a = new int[]{1, 2, 3, 4, 5}; //메모리 주소만 입력

        System.out.println("[배열 a]");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + (i != a.length - 1 ? ", " : "\n")); //마지막 쉼표 생략
        }

        int[] b = a;

        if(a == b) {
            System.out.println("같다");
        }else {
            System.out.println("다르다");
        }

        System.out.println("[배열 b]");
        b[3] = 10;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + (i != b.length - 1 ? ", " : "\n")); //마지막 쉼표 생략
        }

        //주소값 비교 /배열 안에 숫자가 달라도 주소가 같기 때문에 같다고 출력이 된다.
        if(a == b) {
            System.out.println("같다");
        }else {
            System.out.println("다르다");
        }

        //주소값이 같아지면서 pc는 안에 들어있는 값도 같다고 인식
        System.out.println("[배열 a]");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + (i != a.length - 1 ? ", " : "\n")); //마지막 쉼표 생략
        }
    }
}
