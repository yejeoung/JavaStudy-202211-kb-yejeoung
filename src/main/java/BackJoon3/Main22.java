package BackJoon3;

import java.util.Scanner;

public class Main22 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + i + 1;
        }
        System.out.println(sum);
    }
}
