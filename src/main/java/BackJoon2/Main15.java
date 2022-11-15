package BackJoon2;

import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();
        String result = null;

        result = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? "1" : "0";

        System.out.println(result);
    }
}
