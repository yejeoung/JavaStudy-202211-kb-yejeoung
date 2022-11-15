package j02_변수;

/**
 * 클래스 위에만 사용가능한 주석
 */

public class Variable {
    public static void main(String[] args) {
        boolean checkFlag = false; //true와 false 값만 넣을 수 있다.
        System.out.println("논리자료형 : " + checkFlag);
        checkFlag = true;
        System.out.println("논리자료형 : " + checkFlag);

        char name1 = '홍'; //한 글자만 허용
        char name2 = '길';
        System.out.println("" + name1 + name2);
        System.out.println(name1 + name2);
        //char에서 플러스를 할 경우 유니코드로 입력 받기 때문에 출력은 숫자로 나온다. (10진수)
        System.out.println(Integer.toHexString(name1)); //16진수
        System.out.println("\uae40");

        int width = 100;
        int width2 = 200;
        System.out.println(width + width2);

        String sWidth = "100";
        String sWidth2 = "200";
        System.out.println(sWidth + sWidth2);
        //문자열이랑 문자열은 더할 수가 없기 때문에 두 값이 연달아 나오기만 한다.

        double dNum = 2.1;
        double dNum2 = 3.5;
        System.out.println(dNum + dNum2);

        System.out.println("<<<< 형변환 >>>>");

        //한 줄 주석
        /*
        여러줄 주석
         */

        // 업캐스팅
        //문자 -> 정수 -> 실수
        char c1 = 'a';
        System.out.println(c1);
        System.out.println(((int)c1) + 10); //정수로 바꾸면 아스키코드 번호로 변경 /출력할때는 형 변환 명시를 꼭 해주어야한다.
        int n1 = (int) c1; //형 변환 하고자하는 자료형의 색이 없으면 생략 가능
        System.out.println(n1);
        double d1 = (double) n1;
        System.out.println(d1);

        // 다운캐스팅
        //실수 -> 정수 -> 문자
        int n2 = (int) d1; //형 변환 하고자하는 자료형의 색이 있으면 생략 불가능
        System.out.println(n2);

        char c2 = (char)n2;
        System.out.println(c2);
    }
}
