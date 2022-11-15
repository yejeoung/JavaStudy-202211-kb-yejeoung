package j03_연산자;
/*
    논리연산
    &&(AND) - 곱
    ||(OR) - 합
    !(NOT) - 부정

    ture(1)
    false(0)

    true && true => true
    true && false => false

    true || true => true //0 제외 true
    true || true => true
    false || false => false
    !(true && true) => false
 */
public class Operation1 {
    public static void main(String[] args) {
        //boolean a = true;
        boolean a = 100 % 4 == 0;
        boolean b = false;

        System.out.println("<<<< AND >>>>");
        System.out.println(a && a);
        System.out.println(a && b);
        System.out.println(b && b);

        System.out.println("<<<< AND >>>>");
        System.out.println(a || a);
        System.out.println(a || b);
        System.out.println(b || b);
    }
}
