package j05_조건;

public class Condition {
    public static void main(String[] args) {
        int num = 10;

        if(num < 10) {
            System.out.println("10보다 작습니다."); //true가 아니기 때문에 실행이 되지 않는다.
            System.out.println("num의 값은 " + num + "입니다.");
        } else if (num == 10) {
                System.out.println("10입니다.");
        } else {
                System.out.println("10보다 큽니다.");
            }
//        else System.out.println("10보다 작지 않습니다.");
//        //false이기 때문에 실행이 된다.
    }
}
