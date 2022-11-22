package j12_추상.인터페이스;

public class CalcMain {
    public static void main(String[] args) {

        int[] taxPay = new int[]{2000000, 2500000, 2600000, 2700000};
        int[] salaryPay = new int[]{1000000, 1000000, 1000000, 1000000};

        int result1 = 0;
        int result2 = 0;

        Calculator calculator = new Tax(); //업캐스팅 /인터페이스 Calculator에 Tax를 입력
        result1 = calculator.calc(taxPay);
        //taxPay 대신 값을 넣을 때는 배열이다라는 것을 선언해줘야한다.
        //new int[] {2000000, 2500000, 2600000, 270000}
        if (result1 == 0) {
            System.out.println("오류: " + calculator.ERROR_CODE);
        } else {
            System.out.println("result1 => " + result1);
        }

        calculator = new Salary(); //업캐스팅 /인터페이스 Calculator에 Salary를 입력
        result2 = calculator.calc(salaryPay);
        if (result2 == 0) {
            System.out.println("오류: " + calculator.ERROR_CODE);
        } else {
            System.out.println("result2=> " + result2);
        }
    }
}
