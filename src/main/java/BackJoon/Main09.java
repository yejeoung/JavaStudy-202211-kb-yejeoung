package BackJoon;

import java.util.Scanner;

public class Main09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int b = 0;

        a = scanner.nextInt();
        b = scanner.nextInt();

        int three = (b % 1000) / 100;
        int two = (b % 100) / 10;
        int one = (b % 10);

        System.out.println(a * one);
        System.out.println(a * two);
        System.out.println(a * three);
        System.out.println(a * b);
    }
}
