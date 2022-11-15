package BackJoon3;

import java.util.Scanner;

public class Main20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int a = 0; a < 9; a++) {
            int num = a + 1;
            System.out.println(N + " * " + num + " = " + (N * num));
        }
    }
}
