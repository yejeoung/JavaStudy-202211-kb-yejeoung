package j07_메소드;

public class Method1 { //매개변수는 계속 호출할 수 있으며, 호출에 대한 범위는 없다.(무한 매개변수 입력 가능)

    public static void method1() { //void(반환 자료형 자리) : 비어있다 /이 메소드는 반환하는 것이 없다.
        System.out.println("메소드1 호출");
        System.out.println();
        method2(100); //여기 메소드2 값과 밑에 메소드2값이 다르지만 같이 출력을 한다.
    }

    public static void method2(int a) {
        System.out.println("메소드2 호출");
        System.out.println("매개변수 a : " + a);
        System.out.println();
}

    public static int method3(int a, int b) { //void 대신 int를 넣은 이유는 main에서 메소드3값을 구할때 int로 인식하기 위함
        System.out.println("메소드2 호출");
        System.out.println("매개변수 a : " + a);
        System.out.println("매개변수 b : " + b);
        System.out.println("a + b = " + (a + b));
        System.out.println();
        return a + b;
}
//    public static int max(int a, int b) {
//        if (a < b) {
//            return b; // return을 만나면 메소드를 호출하여 조건이 맞으면 끝낸다.
//        } else {
//            return a; //else를 생략하고 return a;만 넣어도 된다.
//        }
    public static int min(int a, int b) {
        int result = 0;

        if (a < b) {
            result = b;
        } else {
            result = a;
        }
        return result;
    }

    public static void main(String[] args) {
        method1(); //메소드 호출
        System.out.println("메소드1 호출 후 출력");
        method2(10);
        int result1 = method3(3000, 7000); //메소드3의 동작을 result1 변수에 값을 넣어준다.
        System.out.println("result1 : " + result1);
    }
}
