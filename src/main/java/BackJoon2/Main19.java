package BackJoon2;

import java.util.Scanner;

public class Main19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int max = 0;

        if (a == b && b == c) {
            System.out.println(10000 + a * 1000);
        } else if (a == b) {
            System.out.println(1000 + a * 100);
        } else if (a == c) {
            System.out.println(1000 + a * 100);
        } else if (b == c) {
            System.out.println(1000 + b * 100);
        } else if (a > b) {
            if (a > c) {
                max = a;
            } else {
                max = c;
            }
            System.out.println(max * 100);
        } else if (b > a) {
            if (b > c) {
                max = b;
            } else {
                max = c;
            }
            System.out.println(max * 100);
        }
    }
}
