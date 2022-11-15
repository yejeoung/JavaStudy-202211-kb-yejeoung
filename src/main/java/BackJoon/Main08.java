package BackJoon;

import java.util.Scanner;

public class Main08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int c = 0;

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        System.out.println((a + b) % c);
        System.out.println(((a % c) + (b % c)) % c);
        System.out.println((a * b) % c);
        System.out.println(((a % c) * (b % c)) % c);
    }
}
