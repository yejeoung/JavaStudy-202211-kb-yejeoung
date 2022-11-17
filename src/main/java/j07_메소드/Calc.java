package j07_메소드;

/*
    1. add(덧셈) -> return int, parameter int x, int y
    2. sub(뺄셈)
    3. mul(곱셈)
    4. div(나눗셈)
    5. mod(나머지)

 */
public class Calc {

    public static int add(int x, int y) {
        return x + y;
    }

    public static int sub(int x, int y) {
        return x - y;
    }

    public static int mul(int x, int y) {
        return x * y;
    }

    public static int div(int x, int y) {
        return x / y;
    }

    public static int mod(int x, int y) {
        return x % y;
    }


    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        int addResult = 0;
        int subResult = 0;
        int mulResult = 0;
        int divResult = 0;
        int modResult = 0;

        System.out.println("a + b = " + addResult);
        System.out.println("a - b = " + subResult);
        System.out.println("a * b = " + mulResult);
        System.out.println("a / b = " + divResult);
        System.out.println("a % b = " + modResult);
    }
}

