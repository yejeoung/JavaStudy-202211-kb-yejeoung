package BackJoon;

import java.util.Scanner;

public class Main07 {
    public static void main(String[] args) {
        int king = 0;
        int queen = 0;
        int rook = 0;
        int bishop = 0;
        int night = 0;
        int pawn = 0;

        Scanner scanner = new Scanner(System.in);

        king = scanner.nextInt();
        queen = scanner.nextInt();
        rook = scanner.nextInt();
        bishop = scanner.nextInt();
        night = scanner.nextInt();
        pawn = scanner.nextInt();

        System.out.println(1 - king);
        System.out.println(1 - queen);
        System.out.println(2 - rook);
        System.out.println(2 - bishop);
        System.out.println(2 - night);
        System.out.println(8 - pawn);
    }
}
